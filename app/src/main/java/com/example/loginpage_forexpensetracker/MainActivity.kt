package com.example.loginpage_forexpensetracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var login :Button
    lateinit var userName : TextView
    lateinit var passWord : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login = findViewById(R.id.LoginBtn)
        userName = findViewById(R.id.Usernametxt)
        passWord = findViewById(R.id.Passwordtxt)


        login.setOnClickListener{
            if(userName.text.isNullOrBlank() && passWord.text.isNullOrBlank()) {
                Toast.makeText(this, "Atleast put some texts dude.", Toast.LENGTH_SHORT).show()
            }
        }


    }
}