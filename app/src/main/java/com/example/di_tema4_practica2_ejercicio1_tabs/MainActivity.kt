package com.example.di_tema4_practica2_ejercicio1_tabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.di_tema4_practica2_ejercicio1_tabs.HomeFragment
import com.example.di_tema4_practica2_ejercicio1_tabs.R
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment_activity_main, HomeFragment())!!.commit()
        toolbar.title = "Tab1"

        val tabLayout: TabLayout = findViewById(R.id.tabs)
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            lateinit var fragment: Fragment


            override fun onTabSelected(tab: TabLayout.Tab) {

                when (tab.position) {
                    0 -> {
                        fragment = HomeFragment()
                    }
                    1 -> {
                        fragment = PlacesFragment()
                    }
                    2 -> {
                        fragment = SlideshowFragment()
                    }
                }

                supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_host_fragment_activity_main, fragment)!!.commit()

                toolbar.title = tab.text
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }
}