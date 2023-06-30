package com.example.vta_app_final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class TabTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_test)

        var viewPager =findViewById(R.id.viewpager)as ViewPager
        var tablayout = findViewById(R.id.tablayout)as TabLayout

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(Level4(),"Level 4")
        fragmentAdapter.addFragment(Level5(),"Level 5")

        viewPager.adapter = fragmentAdapter
        tablayout.setupWithViewPager(viewPager)
    }
}