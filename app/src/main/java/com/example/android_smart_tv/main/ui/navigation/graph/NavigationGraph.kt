package com.example.android_smart_tv.main.ui.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.android_smart_tv.main.ui.features.home.HomeScreen
import com.example.android_smart_tv.main.ui.features.splash.SplashScreen
import com.example.android_smart_tv.main.ui.navigation.route.Routes

@Composable
internal fun NavigationGraph (
    navHostController: NavHostController,
    startDestination: String = Routes.Splash.route
){
    NavHost(
        navController = navHostController,
        startDestination = startDestination
    ) {
        composable(Routes.Splash.route) {
            SplashScreen { route -> navHostController.navigate(route = route) }
        }
        composable("/home") {
            HomeScreen()
        }
    }
}