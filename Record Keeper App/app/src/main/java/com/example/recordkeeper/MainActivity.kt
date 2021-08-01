package com.example.recordkeeper

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.FrameLayout
import android.widget.Toast
import androidx.fragment.app.commit
import com.example.recordkeeper.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_different_screen.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener,
    BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val theClickListener: View.OnClickListener = MyClickListener()

        binding.bottomNav.setOnNavigationItemSelectedListener(this)


    }

    override fun onClick(p0: View?) {
        Toast.makeText(this, "I have made the Activity a click listener", Toast.LENGTH_LONG)
    }

    private fun onRunningClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_content, RunningFragment())
        }
    }

    private fun onCyclingClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_content, BikingFragment())
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.nav_biking) {
            onCyclingClicked()
            return true
        } else if (item.itemId == R.id.nav_running) {
            onRunningClicked()
            return true
        } else {
            return false
        }
    }
}


