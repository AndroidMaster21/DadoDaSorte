package br.com.androidmaster.dadodasorte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import br.com.androidmaster.dadodasorte.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {



    // TODO 1: Declarar a variável do ViewBinding
    lateinit var binding: ActivityMainBinding

    // TODO 2: Definir a lista de todas as faces do dado
    val faces = arrayListOf(
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO 3: Inicializar o ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)

        // TODO 4: Definir o contentView da Activity
        setContentView(binding.root)

        // TODO 5: Detectar o pressionamento do botão
        binding.button.setOnClickListener {

            // TODO 6: Gerar um número aleatório de 0 a 5
            val numeroAleatorio = Random.nextInt(0, faces.size)

            // TODO 7: Obter a face de dado usando o número aleatório
            val imagem = ContextCompat.getDrawable(this, faces[numeroAleatorio])

            // TODO 8: Definir o ImageDrawable do ImageView
            binding.imgDice.setImageDrawable(imagem)
        }
    }



}
