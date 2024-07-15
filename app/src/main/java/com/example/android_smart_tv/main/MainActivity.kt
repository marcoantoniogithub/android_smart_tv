package com.example.android_smart_tv.main

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.navigation.compose.rememberNavController
import androidx.tv.material3.Surface
import com.example.android_smart_tv.core.ui.theme.Android_smart_tvTheme
import com.example.android_smart_tv.main.ui.navigation.graph.NavigationGraph
import com.example.settings.SettingsActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android_smart_tvTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    shape = RectangleShape,
                ) {
                    val navController = rememberNavController()
                    NavigationGraph(
                        navHostController = navController
                    )
                }
            }
        }
    }

    fun navigationSettings() {
        super.onResume()
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }
}