package com.example.toma_medicamentos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val etMail = findViewById<EditText>(R.id.correo)
        val etPass = findViewById<EditText>(R.id.password)
        val loginbtn = findViewById<Button>(R.id.login)
        val registerbtn = findViewById<Button>(R.id.signup)

        loginbtn.setOnClickListener()
        {
            val mail = etMail.text.toString()
            val pass = etPass.text.toString()
            val intent = Intent(this, home_act::class.java)
            startActivity(intent)
            if (mail == "mail" && pass == "pass") {//inicia sesion
                val intent = Intent(this, home_act::class.java)
                startActivity(intent)
                Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
            } else {
                //credenciales incorrectas
                Toast.makeText(this, "Credenciales incorrectas, intente de nuevo.", Toast.LENGTH_SHORT).show();

            }
        }
        registerbtn.setOnClickListener() {
            val intent = Intent(this, sign_up::class.java)
            startActivity(intent)
        }
    }
}