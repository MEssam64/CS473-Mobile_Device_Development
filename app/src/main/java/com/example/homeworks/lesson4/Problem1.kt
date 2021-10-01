package com.example.homeworks.lesson4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.setPadding
import com.example.homeworks.R
import kotlinx.android.synthetic.main.activity_lesson4_problem1.*

class Problem1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson4_problem1)
    }

    @SuppressLint("ResourceAsColor")
    fun btnAdd(view: android.view.View) {
        if(txtAndroidVersion.text.isNotEmpty() && txtAndroidCodeName.text.isNotEmpty()){
            val tableRow = TableRow(applicationContext)
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            tableRow.layoutParams = layoutParams
            //to set padding calculated in dp
            val scale = resources.displayMetrics.density
            val dpAsPixels = (5 * scale + 0.5f).toInt()
            tableRow.setPadding(dpAsPixels)

            val textViewAndroidVersion = TextView(this)
            textViewAndroidVersion.text = txtAndroidVersion.text
            textViewAndroidVersion.setBackgroundColor(R.color.purple)

            val textViewAndroidCodeName = TextView(this)
            textViewAndroidCodeName.text = txtAndroidCodeName.text
            textViewAndroidCodeName.setBackgroundColor(R.color.purple)

            tableRow.addView(textViewAndroidVersion, 0)
            tableRow.addView(textViewAndroidCodeName, 1)

            tableLayoutLesson4Problem1.addView(tableRow)

            txtAndroidVersion.text.clear()
            txtAndroidCodeName.text.clear()

        }
        else
            Toast.makeText(this, "Please fill all blanks", Toast.LENGTH_LONG).show()
    }
}