package com.giuliano.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Procura o botão pelo ID
        val rodarNumero = findViewById<Button>(R.id.btn_rodar)

        // Ao clicar no botão, procura o TextView pelo ID e adiciona um número sorteado a ele.
        rodarNumero.setOnClickListener {
            val texto = findViewById<TextView>(R.id.number_sorted)
            val numeroSorteado = Random.nextInt(11)
            val textDisplayed = "Número sorteado é: $numeroSorteado"
            texto.text = textDisplayed
        }
    }
}