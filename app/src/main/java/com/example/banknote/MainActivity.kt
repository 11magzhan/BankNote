package com.example.banknote

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.banknote.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigation()
        setupFab()
    }

    private fun setupBottomNavigation() {
        with(binding) {
            bottomNavigationView.background = null
            bottomNavigationView.menu.getItem(1).isEnabled = false
            bottomNavigationView.setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.home -> {
                        Toast.makeText(this@MainActivity, R.string.home, Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.settings -> {
                        Toast.makeText(this@MainActivity, R.string.settings, Toast.LENGTH_SHORT)
                            .show()
                        true
                    }
                    else -> false
                }
            }
        }
    }

    private fun setupFab() {
        binding.fab.setOnClickListener {
            Toast.makeText(this, R.string.camera, Toast.LENGTH_SHORT).show()
        }
    }
}