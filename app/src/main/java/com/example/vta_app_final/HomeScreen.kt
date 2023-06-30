package com.example.vta_app_final

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView


class HomeScreen : AppCompatActivity() {
    private lateinit var visionHeaderLayout: LinearLayout
    private lateinit var visionArrow: ImageView
    private lateinit var visionContentLayout: LinearLayout


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)


        // Initialize views
        visionHeaderLayout = findViewById(R.id.visionHeaderLayout)
        visionArrow = findViewById(R.id.visionArrow)
        visionContentLayout = findViewById(R.id.visionContentLayout)

        // Set click listener on visionHeaderLayout
        visionHeaderLayout.setOnClickListener {
            toggleLayoutVisibility(visionContentLayout, visionArrow)
        }

    }

    private fun toggleLayoutVisibility(layout: LinearLayout, arrow: ImageView) {
        if (layout.visibility == View.GONE) {
            layout.visibility = View.VISIBLE
            arrow.setImageResource(R.drawable.baseline_keyboard_arrow_up_24)
        } else {
            layout.visibility = View.GONE
            arrow.setImageResource(R.drawable.baseline_keyboard_arrow_down_24)
        }
    }
}