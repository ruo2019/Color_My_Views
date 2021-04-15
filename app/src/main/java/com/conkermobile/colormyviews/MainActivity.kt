package com.conkermobile.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.image)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.image)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.image)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.image)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.image)
            R.id.box_six_text -> view.setBackgroundResource(R.drawable.image)
            R.id.box_seven_text -> view.setBackgroundResource(R.drawable.image)
            R.id.box_eight_text -> view.setBackgroundResource(R.drawable.image)
            R.id.box_nine_text -> view.setBackgroundResource(R.drawable.image)
            R.id.red_button -> view.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> view.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> view.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val redButton = findViewById<Button>(R.id.red_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)
        val greenButton = findViewById<Button>(R.id.green_button)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val clickableViews: List<View> = listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, boxSixText, boxSevenText, boxEightText, boxNineText, redButton, yellowButton, greenButton, rootConstraintLayout)
        for (item in clickableViews) {
            item.setOnClickListener{ makeColored(it) }
        }
    }
}