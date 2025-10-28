package com.example.toma_medicamentos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home_act : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val btnRegDosis = findViewById<Button>(R.id.regdosis)
        val btnConfToma = findViewById<Button>(R.id.conftoma)
        val btnNotifDosis = findViewById<Button>(R.id.notifdosis)
        val btnResDiario = findViewById<Button>(R.id.resdiario)

        btnRegDosis.setOnClickListener()
        {
            val intent = Intent(this, registrar_dosis::class.java)
            startActivity(intent)
        }

        btnConfToma.setOnClickListener()
        {
            val intent = Intent(this, confirmar_toma::class.java)
            startActivity(intent)
        }

        btnNotifDosis.setOnClickListener()
        {
            val intent = Intent(this, notificacion_dosis::class.java)
            startActivity(intent)
        }

        btnResDiario.setOnClickListener()
        {
            val intent = Intent(this, resumen_diario::class.java)
            startActivity(intent)
        }

    }
}