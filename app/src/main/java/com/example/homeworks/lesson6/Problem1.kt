package com.example.homeworks.lesson6

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.homeworks.R
import kotlinx.android.synthetic.main.activity_lesson6_problem1.*
import java.util.*
import java.util.zip.DeflaterOutputStream

class Problem1 : AppCompatActivity() {
    var checkBoxScore : Double = 0.0
    var selectedOption : Int = -1;
    var isAnyCheckBoxChecked: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson6_problem1)

        radioGroup.setOnCheckedChangeListener { radioGroup, i ->
            selectedOption = i
        }
    }



    fun btnSubmit(view: android.view.View) {
        if(selectedOption != -1 && isAnyCheckBoxChecked) {
            var score = checkBoxScore
            if(selectedOption == R.id.rbLateInit)
                score += 50
            var builder = AlertDialog.Builder(this);
            builder.setTitle("Quiz result")
            builder.setMessage("Congratulations! You submitted on ${Calendar.getInstance().time}, Your achieved $score%")
            builder.setPositiveButton ("Ok!", DialogInterface.OnClickListener { dialogInterface, _ ->
                dialogInterface.dismiss()
                btnReset(view)
            })
            builder.show()
        }
        else {
            Toast.makeText(this, "Please answer all questions", Toast.LENGTH_LONG).show()
        }
    }
    fun btnReset(view: android.view.View) {
        radioGroup.clearCheck()
        selectedOption = -1
        checkBoxScore = 0.0
        checkBox.isChecked = false
        checkBox2.isChecked = false
        checkBox3.isChecked = false
    }

    fun onCheckboxClicked(view: android.view.View) {
        isAnyCheckBoxChecked = checkBox.isChecked || checkBox2.isChecked || checkBox3.isChecked

        if (view is CheckBox) {
            val isAdd: Boolean = view.isChecked
            var value = 0;

            value = when(view.id) {
                R.id.checkBox -> {
                    25
                }

                R.id.checkBox3 -> {
                    25
                }

                else -> {
                    0
                }
            }

            if(isAdd)
                checkBoxScore += value
            else
                checkBoxScore -= value
        }
    }
}