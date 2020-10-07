package lakshya.myappcompany.diceroller

import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage1: ImageView
    lateinit var diceImage2: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val clearButton: Button = findViewById(R.id.clear_button)
        clearButton.setOnClickListener{ clearImages() }
    }

    private fun rollDice() {

        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)
        diceImage1.visibility = View.VISIBLE
        diceImage2.visibility = View.VISIBLE

        getRandomDiceImage(diceImage1, (1..6).random())
        getRandomDiceImage(diceImage2, (1..6).random())

    }

    private fun clearImages() {
        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)
        diceImage1.visibility = View.INVISIBLE
        diceImage2.visibility = View.INVISIBLE
    }

    private fun getRandomDiceImage(diceImage: ImageView, randomInt: Int) {
        val drawableResource = when(randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }


}