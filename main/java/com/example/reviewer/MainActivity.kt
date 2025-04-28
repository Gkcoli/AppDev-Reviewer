package com.example.reviewer

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Move this inside onCreate
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun handleLinearClick(view: View) {
        val intent = Intent(this, LinearActivity::class.java)
        startActivity(intent)
    }

    fun handleRelativeClick(view: View) {
        val intent = Intent(this, RelativeActivity::class.java)
        startActivity(intent)
    }

    fun handleConstraintClick(view: View) {
        val intent = Intent(this, ConstraintActivity::class.java)
        startActivity(intent)
    }


    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart: Activity Visible", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume: Activity Resumed", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause: Activity Paused", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop: Activity Stopped", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart: Activity Restarted", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy: Activity Destroyed", Toast.LENGTH_SHORT).show()
    }
}

