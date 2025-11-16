package com.example.practical3_23012011120

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.Toast
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val emailedittext = findViewById<EditText>(R.id.editText1)
        val passwordedittext = findViewById<EditText>(R.id.loginpassword1)

        findViewById<Button>(R.id.login_button).setOnClickListener {
            val emailvalue = emailedittext.text.toString()
            val passwordvalue = passwordedittext.text.toString()

            if(emailvalue=="23012011120@gnu.ac.in" && passwordvalue=="meet9094"){
                Toast.makeText(this,"Login Succesful",Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this,"Invalid Email or Password",Toast.LENGTH_SHORT).show()
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}