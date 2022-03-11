package com.android.multiplelanguagesupport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button2)

        button.setOnClickListener {
            Toast.makeText(applicationContext,R.string.toast,Toast.LENGTH_SHORT).show()
        }
    }
}