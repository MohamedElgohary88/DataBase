package com.example.database

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Second : AppCompatActivity() {
    lateinit var edSecond: EditText
    lateinit var btn2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        inilitaz()

        btn2.setOnClickListener {
            var value = edSecond.text.toString()
            var i = Intent(this, MainActivity::class.java)
            i.putExtra("key_second", value)
            setResult(Activity.RESULT_OK, i)
            finish()
        }
    }

    fun inilitaz() {
        edSecond = findViewById(R.id.edSecond)
        btn2 = findViewById(R.id.btn2)
    }
}