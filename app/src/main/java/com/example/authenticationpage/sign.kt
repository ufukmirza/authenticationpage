package com.example.authenticationpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign.*

class sign : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

       buttonsave.setOnClickListener {

           var accountname=name.text.toString()
           var accountpassword=password.text.toString()

           var shared=this.getSharedPreferences("bilgiler", MODE_PRIVATE)
           var edit=shared.edit()
           edit.putString("name","$accountname").apply()
           edit.putString("password","$accountpassword").apply()
           Toast.makeText(applicationContext,"save successful",Toast.LENGTH_SHORT).show()



       }

        buttonloginscrreen.setOnClickListener {


            var intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)


        }

    }
}