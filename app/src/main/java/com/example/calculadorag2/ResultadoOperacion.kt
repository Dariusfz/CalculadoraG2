package com.example.calculadorag2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultadoOperacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_operacion)
        val resultado:TextView=findViewById(R.id.resultado)

        val mensaje:String=intent.extras?.getString("operacion").orEmpty()
        resultado.text="El resultado es: $mensaje"


    }
}