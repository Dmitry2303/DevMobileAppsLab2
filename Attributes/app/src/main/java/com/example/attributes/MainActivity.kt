package com.example.attributes

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.edit_text)
        val buttonBlackText: Button = findViewById(R.id.button_black_text)
        val buttonRedText: Button = findViewById(R.id.button_red_text)
        val buttonTextSize8sp: Button = findViewById(R.id.button_text_size_8sp)
        val buttonTextSize24sp: Button = findViewById(R.id.button_text_size_24sp)
        val buttonWhiteBackground: Button = findViewById(R.id.button_white_background)
        val buttonYellowBackground: Button = findViewById(R.id.button_yellow_background)

        buttonBlackText.setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }

        buttonRedText.setOnClickListener {
            editText.setTextColor(Color.RED)
        }

        buttonTextSize8sp.setOnClickListener {
            editText.textSize = 8f
        }

        buttonTextSize24sp.setOnClickListener {
            editText.textSize = 24f
        }

        buttonWhiteBackground.setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }

        buttonYellowBackground.setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}
