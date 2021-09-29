package com.example.homeworks.lesson3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.homeworks.R
import kotlinx.android.synthetic.main.activity_main_lesson3.*

class MainActivity : AppCompatActivity() {
    private var foodList = mutableListOf<String>("Hamburger", "Pizza", "Mexican", "American", "Chinese")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lesson3)
    }

    fun btnAddFoodClick(view: android.view.View) {
        if(txtNewFoodText.text.isEmpty())
            Toast.makeText(this, "Please enter food name first", Toast.LENGTH_LONG).show()
        else
        {
            foodList.add(txtNewFoodText.text.toString())
            Toast.makeText(this, "Food added to list successfully", Toast.LENGTH_LONG).show()
            txtNewFoodText.text.clear()
        }
    }
    fun btnDecideClick(view: android.view.View) {
        txtViewFood.text = foodList.random()
    }
}