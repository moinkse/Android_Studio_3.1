package com.example.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var button2 = findViewById(R.id.button2) as Button
        val bundle: Bundle = intent.extras!!
        val id = bundle.get("id_value")
        val language = bundle.get("language_value")
        Toast.makeText(applicationContext,id.toString()+""+language,Toast.LENGTH_LONG).show()
        button2.setOnClickListener(){
                intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
    }
}
