package ru.pakarpichev.getbinapplication.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay
import ru.pakarpichev.getbinapplication.R
import ru.pakarpichev.getbinapplication.presentation.navigation.Screens
import ru.pakarpichev.getbinapplication.ui.theme.GetBINApplicationTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SplashScreen(navController: NavController) {
    Box() {

        LaunchedEffect(key1 = true){
            delay(1000)
            navController.navigate(Screens.StartScreen.route){
                popUpTo(Screens.SplashScreen.route){
                    inclusive = true

                }
            }

        }

        Image(
            painterResource(id = R.drawable.splash_image_1),
            contentDescription ="splash_image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        
    }
    
    
}

@Preview(showBackground = true)
@Composable
fun splashPrew(){
    GetBINApplicationTheme() {
    SplashScreen(navController = rememberNavController())

    }
}