package br.com.fiap.semaforo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        semaforo()
    }

    fun semaforo() {
        val btnPare = findViewById<Button>(R.id.btnPare)
        val btnEspere = findViewById<Button>(R.id.btnEspere)
        val btnSiga = findViewById<Button>(R.id.btnSiga)

        val sinalVermelho = findViewById<ImageView>(R.id.imgSemaforoRed)
        val sinalAmarelo = findViewById<ImageView>(R.id.imgSemaforoYellow)
        val sinalVerde = findViewById<ImageView>(R.id.imgSemaforoGreen)

        sinalVermelho.visibility = View.VISIBLE
        sinalAmarelo.visibility = View.INVISIBLE
        sinalVerde.visibility = View.INVISIBLE

        btnPare.setOnClickListener {
            sinalVermelho.visibility = View.VISIBLE
            sinalAmarelo.visibility = View.INVISIBLE
            sinalVerde.visibility = View.INVISIBLE
        }

        btnEspere.setOnClickListener {
            sinalVermelho.visibility = View.INVISIBLE
            sinalAmarelo.visibility = View.VISIBLE
            sinalVerde.visibility = View.INVISIBLE
        }

        btnSiga.setOnClickListener {
            sinalVermelho.visibility = View.INVISIBLE
            sinalAmarelo.visibility = View.INVISIBLE
            sinalVerde.visibility = View.VISIBLE
        }
    }
}