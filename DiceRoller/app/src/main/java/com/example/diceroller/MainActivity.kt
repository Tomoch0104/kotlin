package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
//import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button) // rollButtonにButtonの参照とID roll_buttonを取得し代入
        rollButton.setOnClickListener{ rollDice() } // クリックハンドラとしてrollDice()を割り当て

        val countupButton: Button = findViewById(R.id.countup_button)
        countupButton.setOnClickListener{ countUp() }
    }

    private fun rollDice(){
//        トーストの表示
//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()

        val randomInt = (1..6).random() // 1~6までのランダムな整数を生成

        val resultText: TextView = findViewById(R.id.result_test)
        resultText.text = randomInt.toString() // randomIntを文字列で表示
    }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_test)
        if (resultText.text == "Hello World!"){
            resultText.text = "1"
        } else {
            val resultInt = resultText.text.toString().toInt()
//            6以下の場合数字を+1する
            if (resultInt < 6) {
                resultText.text = (resultInt + 1).toString()
            }
        }
    }
}