package lakshya.myappcompany.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countUpButton: Button = findViewById(R.id.count_up_button)
        rollButton.setOnClickListener { rollDice() }
//        countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
//        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = "Dice Rolled!"
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }

/*
private fun countUp() {
val resultText: TextView = findViewById(R.id.result_text)
val currentVal = resultText.text.toString()
var finalVal= 0
when (currentVal) {
"Hello, World!" -> finalVal=1
"6" -> finalVal=6
else -> finalVal = currentVal.toInt()+1
}


resultText.text = (finalVal).toString()
}
*/
}