package com.example.database

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Third : AppCompatActivity() {
    lateinit var btn4: Button
    lateinit var etThird: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        inilitaz()
        btn4.setOnClickListener {
            var valueThird = etThird.text.toString()
            var ith = Intent(this, MainActivity::class.java)
            ith.putExtra("key-third", valueThird)
            setResult(Activity.RESULT_OK, ith)
            finish()
        }
    }

    fun inilitaz() {
        etThird = findViewById(R.id.etThird)
        btn4 = findViewById(R.id.btn4)
    }
}