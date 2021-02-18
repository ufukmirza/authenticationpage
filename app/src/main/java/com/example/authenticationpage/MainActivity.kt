package com.example.authenticationpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonsignup.setOnClickListener {

            var intent = Intent(applicationContext,sign::class.java)
            startActivity(intent)


        }

        buttonlogin.setOnClickListener {


            var shared=this.getSharedPreferences("bilgiler", MODE_PRIVATE)
            var accountname=shared.getString("name","")
            var accountpassword=shared.getString("password","")

            if(accountname==name.text.toString()&&accountpassword==password.text.toString()) {
                Toast.makeText(applicationContext, "Login Successful", Toast.LENGTH_SHORT).show()
                var intent = Intent(applicationContext,login::class.java)
                startActivity(intent)
            }
                else
                Toast.makeText(applicationContext,"Login Unsuccessful", Toast.LENGTH_SHORT).show()


        }

    }
}