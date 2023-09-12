package com.delminiusdevs.diaryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.delminiusdevs.diaryapp.ui.theme.DiaryAppTheme

class MainActivity : ComponentActivity() {

    private var keepSplashOpened = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            DiaryAppTheme {

            }
        }
    }
}

