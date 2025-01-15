package com.example.logging

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Timber.plant(Timber.DebugTree())

        val editText: EditText = findViewById(R.id.edit_text)
        val buttonLog: Button = findViewById(R.id.button_log)
        val buttonTimber: Button = findViewById(R.id.button_timber)


        buttonLog.setOnClickListener {
            Log.v("From EditText", editText.text.toString())
        }


        buttonTimber.setOnClickListener {
            Timber.v(editText.text.toString())
        }
    }
}
