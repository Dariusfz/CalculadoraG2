package com.example.calculadorag2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import model.OperacionesMatematicas

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //llamar a la vista



        val numero1:EditText=findViewById(R.id.numero1)
        val numero2:EditText=findViewById(R.id.numero2)
        val botonSuma:Button=findViewById(R.id.buttonSuma)
        val botonResta:Button=findViewById(R.id.buttonResta)
        val botonMultiplicacion:Button=findViewById(R.id.buttonMultiplicacion)
        val botonDivision:Button=findViewById(R.id.buttonDivision)
        val mensaje:TextView=findViewById(R.id.textView)

        val operacionesMatematicas=OperacionesMatematicas()

        botonSuma.setOnClickListener {
            var primerNumero=numero1.text.toString().toIntOrNull()
            var segundoNumero=numero2.text.toString().toIntOrNull()
            if(primerNumero!=null && segundoNumero!=null){
             var mensajeResultado= operacionesMatematicas.sumar(primerNumero, segundoNumero).toString()
                val intent= Intent(this,ResultadoOperacion::class.java)
                intent.putExtra("operacion",mensajeResultado)
                startActivity(intent)
            }else mensaje.text="UPPS!!! DEBES AGREGAR UN NUMERO EN CADA CAMPO"

        }

        botonResta.setOnClickListener {
           var primerNumero=numero1.text.toString().toIntOrNull()
           var segundoNumero=numero2.text.toString().toIntOrNull()
            if(primerNumero!=null && segundoNumero!=null){
                var mensajeResultado=operacionesMatematicas.restar(primerNumero, segundoNumero).toString()
                val intent=Intent(this,ResultadoOperacion::class.java)
                intent.putExtra("operacion",mensajeResultado)
                startActivity(intent)

            }else mensaje.text="UPPS!!! DEBES AGREGAR UN NUMERO EN CADA CAMPO"

        }

        botonMultiplicacion.setOnClickListener {
            var primerNumero=numero1.text.toString().toIntOrNull()
            var segundoNumero=numero2.text.toString().toIntOrNull()
            if(primerNumero!=null && segundoNumero!=null){
                var mensajeResultado=operacionesMatematicas.multiplicar(primerNumero, segundoNumero).toString()
                var intent=Intent(this,ResultadoOperacion::class.java)
                intent.putExtra("operacion",mensajeResultado)
                startActivity(intent)
            }else mensaje.text="UPPS!!! DEBES AGREGAR UN NUMERO EN CADA CAMPO"

        }

        botonDivision.setOnClickListener {
            var primerNumero=numero1.text.toString().toIntOrNull()
            var segundoNumero=numero2.text.toString().toIntOrNull()
            if(primerNumero!=null && segundoNumero!=null){
                if(primerNumero!=0 && segundoNumero!=0){
                    var mensajeResultado=operacionesMatematicas.dividir(primerNumero, segundoNumero).toString()
                    var intent=Intent(this,ResultadoOperacion::class.java)
                    intent.putExtra("operacion",mensajeResultado)
                    startActivity(intent)

                }else mensaje.text="NO SE PUEDE DIVIDIR ENTRE 0"

            }else mensaje.text="UPPS!!! DEBES AGREGAR UN NUMERO EN CADA CAMPO"


        }




    }
}