package com.example.latihan4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpan = findViewById<Button>(R.id.simpan)

        simpan.setOnClickListener {
            Toast.makeText(this@MainActivity, "Berhasil", Toast.LENGTH_SHORT).show()
        }
    }
}