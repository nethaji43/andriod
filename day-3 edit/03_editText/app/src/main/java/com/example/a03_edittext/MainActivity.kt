package com.example.a03_edittext

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val mail_edit = findViewById<EditText>(R.id.mail_edit)
        val password_edit = findViewById<EditText>(R.id.password_edit)
        val button = findViewById<Button>(R.id.submit_button)

        button.setOnClickListener {
            val mail = mail_edit.text.toString()
            val password = password_edit.text.toString()

            if (mail.isEmpty()){
                Toast.makeText(this, "mail required", Toast.LENGTH_SHORT).show()
            }
            else if(password.isEmpty()){
                Toast.makeText(this, "password required", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Login sucessfully", Toast.LENGTH_SHORT).show()
            }
        }
    }
}