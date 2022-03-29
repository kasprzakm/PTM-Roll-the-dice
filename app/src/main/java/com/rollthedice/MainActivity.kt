package com.rollthedice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(localClassName, "onCreate")
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.rollButton)

        button.setOnClickListener() {
            rollDice()
        }
    }

    fun rollDice() {
        val dice = Dice()
        val roll = dice.roll()
        val roll2 = dice.roll(false)
        updateText(roll, roll2)
        updateImg(roll, roll2)
    }

    fun updateText(roll: Int, roll2: Int) {

    }
    fun updateImg(roll: Int, roll2: Int) {

    }

    override fun onStart() {
        super.onStart()
        Log.i(localClassName, "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i(localClassName, "onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i(localClassName, "onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i(localClassName, "onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(localClassName, "onDestroy")
    }
}

