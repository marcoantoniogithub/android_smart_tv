package com.example.android_smart_tv.main.ui.features.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.android_smart_tv.R
import com.example.android_smart_tv.main.ui.navigation.route.Routes

@Composable
fun SplashScreen(onNavigation: (route: String) -> Unit) {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.splash_animation))
    val progress by animateLottieCompositionAsState(composition)


    if(progress == 1f) {
        onNavigation(Routes.Home.route)
    }

    Box(
        modifier = Modifier
            .fillMaxSize(1f),
        contentAlignment = Alignment.Center
    ) {
        LottieAnimation(
            composition = composition,
            progress = { progress },
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxHeight()
        )
    }
}

@Composable
@Preview
fun PreviewLoader() {
    SplashScreen(onNavigation = { })
}