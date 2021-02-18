package com.example.authenticationpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonloginscrreen2.setOnClickListener {

            var intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)

        }
    }
}