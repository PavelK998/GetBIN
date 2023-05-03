package ru.pakarpichev.getbinapplication.di

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.pakarpichev.getbinapplication.data.firebase.AuthRepositoryImpl
import ru.pakarpichev.getbinapplication.domain.repository.AuthRepository
import ru.pakarpichev.getbinapplication.domain.usecases.AuthUseCase
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object FirebaseModule {

    @Singleton
    @Provides
    fun provideFirebaseAuth() = FirebaseAuth.getInstance()

    @Singleton
    @Provides
    fun provideFirebaseFirestore() = FirebaseFirestore.getInstance()

    @Singleton
    @Provides
    fun provideAuthRepository(
        firebaseAuth: FirebaseAuth,
        firebaseFirestore: FirebaseFirestore)=AuthRepositoryImpl(firebaseAuth = firebaseAuth, firebaseFirestore = firebaseFirestore)


    @Singleton
    @Provides
    fun provideAuthUseCase (authRepository: AuthRepository) = AuthUseCase(repository = authRepository)
}