package br.com.androidmaster.dadodasorte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import br.com.androidmaster.dadodasorte.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    // TODO 1: Declarar a variável do ViewBinding

    // TODO 2: Definir a lista de todas as faces do dado

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO 3: Inicializar o ViewBinding

        // TODO 3: Definir a view da Activity
        setContentView()

        // TODO 3: Detectar o pressionamento do botão
        binding.button.setOnClickListener {

            // TODO 5: Gerar um número aleatório de 0 a 6

            // TODO 6: Obter o Drawable da face do dado usando o número aleatório

            // TODO 7: Definir o ImageDrawable no ImageView
        }
    }
}