package com.example.homeworks.lesson6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.homeworks.R

class ShoppingCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson6_shopping_category)
    }

    fun btnElectronicsClick(view: android.view.View) {
        var intent = Intent(this, Problem3::class.java)
        startActivity(intent)
    }

    fun btnClothingClick(view: android.view.View) {
        var intent = Intent(this, Problem2::class.java)
        startActivity(intent)
    }

    fun btnBeautyClick(view: android.view.View) {
        showToastCategory("Beauty")
    }

    fun btnFoodClick(view: android.view.View) {
        showToastCategory("Food")
    }

    private fun showToastCategory(category: String){
        Toast.makeText(this, "You have  chosen the  $category  category  of  shopping", Toast.LENGTH_LONG).show()
    }
}