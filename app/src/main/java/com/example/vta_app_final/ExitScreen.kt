package com.example.vta_app_final

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class ExitScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exit_screen)

        // Automatically exit the app after a delay
        Handler(Looper.getMainLooper()).postDelayed({
            finishAffinity() // Close all activities of the app
        }, 1000)
    }
}
