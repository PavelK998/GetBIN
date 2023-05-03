package ru.pakarpichev.getbinapplication.data.firebase

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await
import ru.pakarpichev.getbinapplication.domain.model.NetworkResult
import ru.pakarpichev.getbinapplication.domain.model.UserModel
import ru.pakarpichev.getbinapplication.domain.repository.AuthRepository
import ru.pakarpichev.getbinapplication.utils.Constants
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val firebaseAuth: FirebaseAuth,
    private val firebaseFirestore: FirebaseFirestore
    ): AuthRepository  {
    val  TAG = "AuthRepositoryImpl"

    override suspend fun signIn(user: UserModel): Flow<NetworkResult<Boolean>> {
        return flow {
            var isSuccess = false

            emit(NetworkResult.Loading())

            try {
                firebaseAuth.createUserWithEmailAndPassword(user.login, user.password)
                    .addOnCompleteListener{ task ->
                        isSuccess = if (task.isSuccessful){
                            Log.d(TAG, "createUserWithEmailAndPassword: success")
                            val firebaseUser = firebaseAuth.currentUser
                            if (firebaseUser != null){
                                user.userId = firebaseUser.uid
                                firebaseFirestore
                                    .collection(Constants.USERS)
                                    .document(firebaseUser.uid)
                                    .set(user)
                             }
                            firebaseUser != null
                        } else {
                            false
                        }
                    }.await()

                if(isSuccess) {
                    emit(NetworkResult.Success(true))
                } else {
                    emit(NetworkResult.Error("Oh, something went wrong!"))
                }


            } catch (e: Exception){
                emit(NetworkResult.Error(message = e.localizedMessage ?:"Oh, something went wrong!"))
            }

            
        }

    }


    override suspend fun logIn(email: String, password: String): Flow<NetworkResult<Boolean>> {
        return  flow {
            var isSuccess = false

            emit(NetworkResult.Loading())

            try {

                firebaseAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        isSuccess = if (task.isSuccessful) {
                            Log.d(TAG, "signInWithEmailAndPassword: success")
                            firebaseAuth.currentUser != null
                        } else{
                            Log.d(TAG, "signInWithEmailAndPassword: success", task.exception)
                            false
                        }

                    }.await()

                if(isSuccess) {
                    emit(NetworkResult.Success(true))
                } else {
                    emit(NetworkResult.Error("Oh, something went wrong!"))
                }
            } catch (e: Exception){
                emit(NetworkResult.Error(message = e.localizedMessage ?:"Oh, something went wrong!"))
            }
        }


    }


}

