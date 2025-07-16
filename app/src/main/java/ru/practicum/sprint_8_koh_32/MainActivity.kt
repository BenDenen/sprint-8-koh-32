package ru.practicum.sprint_8_koh_32

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate $this" )
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tvTitle = findViewById<TextView>(R.id.tv_title)

        tvTitle.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart $this" )
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume $this" )
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart $this" )
    }

    override fun onStop() {
        Log.d(TAG, "onStop $this" )
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy $this" )
        super.onDestroy()
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}