package com.example.database

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn1 :Button
    lateinit var btn3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inilitaz()
        btn1.setOnClickListener { val i = Intent(this,Second::class.java)
           // startActivity(i)
            startActivityForResult(i,2) }

        btn3.setOnClickListener { var intentTH = Intent(this,Third::class.java)
            startActivityForResult(intentTH,3)}

    }
    fun inilitaz(){
        btn1 = findViewById(R.id.btn1)
        btn3 =findViewById(R.id.btn3)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==2 && resultCode== Activity.RESULT_OK ){
       val intent = data!!.extras!!.getString("key_second")
            Toast.makeText(this,intent,Toast.LENGTH_SHORT).show()
        }else if(requestCode==3 && resultCode== Activity.RESULT_OK){
            var intentTH = data!!.extras!!.getString("key-third")
            Toast.makeText(this,intentTH,Toast.LENGTH_SHORT).show()
        }
    }
}