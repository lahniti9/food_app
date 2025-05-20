package com.example.fast_food_delivery_app

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    // Duration of splash screen in milliseconds
    private val SPLASH_TIME: Long = 2000 // 2 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(mainLooper).postDelayed({
            // After the delay, start the MainActivity
            startActivity(Intent(this, WelcomeActivity::class.java))
            finish()
        }, SPLASH_TIME)
    }
}