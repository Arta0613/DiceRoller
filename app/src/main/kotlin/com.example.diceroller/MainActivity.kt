package com.example.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRollButton()
    }

    private fun setupRollButton() {
        roll_button.text = getString(R.string.roll)
        roll_button.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        roll_result.text = (Random.nextInt(6) + 1).toString()
    }
}
