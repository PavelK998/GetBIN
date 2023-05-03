 package ru.pakarpichev.getbinapplication.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import ru.pakarpichev.getbinapplication.presentation.screens.SplashScreen
import ru.pakarpichev.getbinapplication.presentation.screens.StartScreen
import ru.pakarpichev.getbinapplication.presentation.screens.historyScreen.HistoryScreen
import ru.pakarpichev.getbinapplication.presentation.screens.resultScreen.ResultScreen

sealed class Screens (val route:String){
    object StartScreen: Screens(route = "start_screen")
    object ResultScreen: Screens(route = "result_screen")
    object HistoryScreen: Screens(route = "history_screen")
    object SplashScreen: Screens(route = "splash_screen")

}



@Composable
fun SetupNavHost(navController: NavHostController) {
    NavHost(
        navController = navController ,
        startDestination = Screens.SplashScreen.route
    ){
        composable(route = Screens.StartScreen.route){
            StartScreen(navController = navController)
        }
        // В этой функции кроме route передаем также введенный пользователем текст
        composable(route = Screens.ResultScreen.route + "/{userText}", arguments = listOf(navArgument("userText"){type = NavType.StringType})){
            ResultScreen(navController = navController, it.arguments?.getString("userText"))
        }
        composable(route = Screens.HistoryScreen.route){
            HistoryScreen(navController = navController)
        }
        composable(route = Screens.SplashScreen.route){
            SplashScreen(navController = navController)
        }


    }

}