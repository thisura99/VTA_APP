package com.example.vta_app_final

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.Spinner
import android.widget.Toast
import com.etebarian.meowbottomnavigation.MeowBottomNavigation

class CourseScreen : AppCompatActivity() {

    private lateinit var bottomNavigation: MeowBottomNavigation

    private lateinit var centers: RelativeLayout
    private lateinit var courses: RelativeLayout
    private lateinit var home: RelativeLayout
    private lateinit var info: RelativeLayout
    private lateinit var exit: RelativeLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_screen)


        bottomNavigation = findViewById(R.id.bottomNavigation)

        centers = findViewById(R.id.centers)
        courses = findViewById(R.id.courses)
        home = findViewById(R.id.home)
        info = findViewById(R.id.info)
        exit = findViewById(R.id.exit)

        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.ic_center))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.ic_course))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.ic_home))
        bottomNavigation.add(MeowBottomNavigation.Model(4, R.drawable.ic_add))
        bottomNavigation.add(MeowBottomNavigation.Model(5, R.drawable.ic_exit))

        bottomNavigation.show(3, enableAnimation = true)

        bottomNavigation.setOnClickMenuListener { model ->
            when (model.id) {
                1 -> {
                    centers.visibility = View.VISIBLE
                    courses.visibility = View.GONE
                    home.visibility = View.GONE
                    info.visibility = View.GONE
                    exit.visibility = View.GONE
                }
                2 -> {
                    centers.visibility = View.GONE
                    courses.visibility = View.VISIBLE
                    home.visibility = View.GONE
                    info.visibility = View.GONE
                    exit.visibility = View.GONE
                }
                3 -> {
                    centers.visibility = View.GONE
                    courses.visibility = View.GONE
                    home.visibility = View.VISIBLE
                    info.visibility = View.GONE
                    exit.visibility = View.GONE
                }
                4 -> {
                    centers.visibility = View.GONE
                    courses.visibility = View.GONE
                    home.visibility = View.GONE
                    info.visibility = View.VISIBLE
                    exit.visibility = View.GONE
                }
                5 -> {
                    centers.visibility = View.GONE
                    courses.visibility = View.GONE
                    home.visibility = View.GONE
                    info.visibility = View.GONE
                    exit.visibility = View.VISIBLE
                }
            }
            // YOUR CODES
        }

        bottomNavigation.setOnShowListener { model ->
            when (model.id) {
                1 -> {
                    centers.visibility = View.VISIBLE
                    courses.visibility = View.GONE
                    home.visibility = View.GONE
                    info.visibility = View.GONE
                    exit.visibility = View.GONE
                }
            }
            // YOUR CODES
        }

        bottomNavigation.setOnShowListener { model ->
            when (model.id) {
                2 -> {
                    centers.visibility = View.GONE
                    courses.visibility = View.VISIBLE
                    home.visibility = View.GONE
                    info.visibility = View.GONE
                    exit.visibility = View.GONE
                }
            }
            // YOUR CODES
        }

        bottomNavigation.setOnShowListener { model ->
            when (model.id) {
                3 -> {
                    centers.visibility = View.GONE
                    courses.visibility = View.GONE
                    home.visibility = View.VISIBLE
                    info.visibility = View.GONE
                    exit.visibility = View.GONE
                }
            }
            // YOUR CODES
        }

        bottomNavigation.setOnShowListener { model ->
            when (model.id) {
                4 -> {
                    centers.visibility = View.GONE
                    courses.visibility = View.GONE
                    home.visibility = View.GONE
                    info.visibility = View.VISIBLE
                    exit.visibility = View.GONE
                }
            }
            // YOUR CODES
        }

        bottomNavigation.setOnShowListener { model ->
            when (model.id) {
                5 -> {
                    centers.visibility = View.GONE
                    courses.visibility = View.GONE
                    home.visibility = View.GONE
                    info.visibility = View.GONE
                    exit.visibility = View.VISIBLE
                }
            }
            // YOUR CODES
        }

    }

}