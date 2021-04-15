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
            R.id.box_one_text -> view.setBackgroundColor(Color.RED)
            R.id.box_two_text -> view.setBackgroundColor(Color.rgb(247, 112, 27))
            R.id.box_three_text -> view.setBackgroundColor(Color.rgb(245, 212, 0))
            R.id.box_four_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_six_text -> view.setBackgroundColor(Color.rgb(153, 50, 204))
            R.id.box_seven_text -> view.setBackgroundColor(Color.rgb(0, 230, 61))
            R.id.box_eight_text -> view.setBackgroundColor(Color.rgb(0, 227, 45))
            R.id.box_nine_text -> view.setBackgroundColor(Color.rgb(0, 166, 255))
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setColors(button: Button) {
        when (button.id) {
            R.id.red_button -> findViewById<TextView>(R.id.box_three_text).setBackgroundResource(R.color.my_red)
            R.id.green_button -> findViewById<TextView>(R.id.box_four_text).setBackgroundResource(R.color.my_green)
            R.id.yellow_button -> findViewById<TextView>(R.id.box_five_text).setBackgroundResource(R.color.my_yellow)
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
        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val clickableViews: List<View> = listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, boxSixText, boxSevenText, boxEightText, boxNineText, rootConstraintLayout)
        for (item in clickableViews) {
            item.setOnClickListener{ makeColored(it) }
        }
        for (item in listOf<Button>(findViewById(R.id.red_button), findViewById(R.id.green_button), findViewById(R.id.yellow_button))) {
            item.setOnClickListener { setColors(it as Button) }
        }
    }
}