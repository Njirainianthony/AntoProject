package com.example.antoproject.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.antoproject.ui.theme.screens.about.AboutScreen

import com.example.antoproject.ui.theme.screens.home.HomeScreen
import com.example.antoproject.ui.theme.screens.login.LoginScreen
import com.example.antoproject.ui.theme.screens.signup.SignUpScreen
import com.example.antoproject.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }

        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }

        composable(ROUT_SIGN) {
            SignUpScreen(navController = navController)
        }

        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }

    }
}