package com.example.vta_app_final

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.SupportMapFragment

class CustomMapFragment : SupportMapFragment() {

    private var touchListener: View.OnTouchListener? = null

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = super.onCreateView(inflater, container, savedInstanceState)

        // Set a touch listener to intercept touch events
        view.isClickable = true
        view.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> touchListener?.onTouch(view, event)
                MotionEvent.ACTION_UP -> touchListener?.onTouch(view, event)
            }
            return@setOnTouchListener true
        }

        return view
    }


    fun setTouchListener(touchListener: View.OnTouchListener) {
        this.touchListener = touchListener
    }
}
