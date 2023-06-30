package com.example.vta_app_final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import com.squareup.picasso.Picasso

class TestMap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_map)


        val imageView = findViewById<ImageView>(R.id.mapImageView)

        val latitude = 40.7128
        val longitude = -74.0060
        val zoom = 12
        val accessToken = "YOUR_MAPBOX_ACCESS_TOKEN"

        val imageUrl = "https://api.mapbox.com/styles/v1/mapbox/streets-v11/static/$longitude,$latitude,$zoom,0,0/600x400?access_token=$accessToken"

        // Use a library like Picasso to load and display the image in the ImageView
        Picasso.get().load(imageUrl).into(imageView)

    }
}



