package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    findViewById<Button>(R.id.mojprzycisk).setOnClickListener {
        findViewById<Button>(R.id.mojprzycisk).text = "moja reakcja na ta informacje"
    }
    }
}