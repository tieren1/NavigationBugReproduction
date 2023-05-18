package com.example.navigationissue

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(
            R.id.nav_host_fragment,
        ) as NavHostFragment
        navController = navHostFragment.navController

        val navGraph = navController.navInflater.inflate(R.navigation.main_graph).apply {
            // Conditional start destination such as login
            setStartDestination(R.id.navigation_start)
        }
        navController.graph = navGraph

        // Setup the bottom navigation view with navController
        // val bottomNavigationView = findViewById<NavigationBarView>(R.id.bottom_nav)
        // bottomNavigationView.setupWithNavController(navController)
    }
}
