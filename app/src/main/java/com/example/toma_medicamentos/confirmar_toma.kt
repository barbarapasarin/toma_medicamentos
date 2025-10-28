package com.example.toma_medicamentos

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class confirmar_toma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_confirmar_toma)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroupToma)
        val btnConfirmar = findViewById<Button>(R.id.btnConfirmar)

        btnConfirmar.setOnClickListener {
            val selectedId = radioGroup.checkedRadioButtonId

            if (selectedId != -1) {
                val radioButton = findViewById<RadioButton>(selectedId)
                val respuesta = radioButton.text.toString()
                Toast.makeText(this, "Has seleccionado: $respuesta", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Por favor selecciona una opción", Toast.LENGTH_SHORT).show()
            }
        }
    }
}