package com.example.toma_medicamentos

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        val etName = findViewById<EditText>(R.id.name)
        val etEmail = findViewById<EditText>(R.id.mail)
        val etPassword = findViewById<EditText>(R.id.contrasena)
        val btnRegister = findViewById<Button>(R.id.registrar)

        btnRegister.setOnClickListener {
            val name = etName.text.toString()
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor completa todos los campos", Toast.LENGTH_SHORT)
                    .show()
            } else {
                // Guardar datos en SharedPreferences
                val sharedPref = getSharedPreferences("UserData", Context.MODE_PRIVATE)
                val editor = sharedPref.edit()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                editor.putString("name", name)
                editor.putString("email", email)
                editor.putString("password", password)
                editor.apply()

                Toast.makeText(this, "Usuario registrado con éxito", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}