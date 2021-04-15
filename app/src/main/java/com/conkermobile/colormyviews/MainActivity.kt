package com.conkermobile.colormyviews
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun makeColored(view: View) {
        val rnd = Random()
        val color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
        if (view.id != R.id.constraint_layout) {
            view.setBackgroundColor(color)
        } else {
            view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {
        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<TextView> =
                listOf(findViewById(R.id.box_one_text), findViewById(R.id.box_two_text),
                        findViewById(R.id.box_three_text), findViewById(R.id.box_four_text),
                        findViewById(R.id.box_five_text), findViewById(R.id.box_six_text),
                        findViewById(R.id.box_seven_text), findViewById(R.id.box_eight_text),
                        findViewById(R.id.box_nine_text), findViewById(R.id.box_ten_text),
                        findViewById(R.id.box_eleven_text), findViewById(R.id.box_twelve_text),
                        findViewById(R.id.box_thirteen_text), findViewById(R.id.box_fourteen_text),
                        findViewById(R.id.box_fifteen_text), findViewById(R.id.box_sixteen_text),
                        findViewById(R.id.box_seventeen_text))

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }

        rootConstraintLayout.setOnClickListener { it.setBackgroundColor(Color.LTGRAY) }
    }
}