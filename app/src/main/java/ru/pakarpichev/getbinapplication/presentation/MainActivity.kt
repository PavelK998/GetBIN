package ru.pakarpichev.getbinapplication.presentation

import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.google.firebase.FirebaseApp
import dagger.hilt.android.AndroidEntryPoint
import ru.pakarpichev.getbinapplication.presentation.navigation.SetupNavHost
import ru.pakarpichev.getbinapplication.ui.theme.GetBINApplicationTheme


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private var pressedTime: Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        FirebaseApp.initializeApp(applicationContext)

                setContent {
            val navController= rememberNavController()
            GetBINApplicationTheme {
                Surface(

                     modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SetupNavHost(navController = navController)

                }
            }
        }

        // Выход из приложения по двойному нажатию на системную кнопку "назад"
        onBackPressedDispatcher.addCallback(this, object: OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (pressedTime + 3000 >  System.currentTimeMillis()){
                    finish()
                } else {
                    Toast.makeText(baseContext, "Press again to exit", Toast.LENGTH_SHORT).show()
                }
                pressedTime = System.currentTimeMillis()

            }
        })
        }
    }




