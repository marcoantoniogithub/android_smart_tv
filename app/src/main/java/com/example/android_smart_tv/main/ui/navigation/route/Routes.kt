package com.example.android_smart_tv.main.ui.navigation.route

internal sealed class Routes (val route: String) {

    object Splash: Routes(route = "/Splash")
    object Home : Routes(route = "/Home")
}