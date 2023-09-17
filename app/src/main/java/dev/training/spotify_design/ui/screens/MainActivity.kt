package dev.training.spotify_design.ui.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import dev.training.spotify_design.R
import dev.training.spotify_design.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // install splash here
        installSplashScreen()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavView()
    }

    private fun setupBottomNavView() {
        val mainNavHostFragment = supportFragmentManager
            .findFragmentById(R.id.main_nav_host_fragment)!!
        val navController = mainNavHostFragment
            .findNavController()
        val bnv = binding.bottomNavView

        // set it up
        bnv.setupWithNavController(navController)
        /*// guard navigation to change visibility
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.settingsFragment,
                R.id.runFragment,
                R.id.statisticsFragment,
                -> bnv.isVisible = true

                else -> bnv.isVisible = false
            }
        }*/
    }
}