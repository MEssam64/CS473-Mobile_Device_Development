package com.example.homeworks.lesson5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.homeworks.R
import kotlinx.android.synthetic.main.activity_lesson5_shopping_category.*

class ShoppingCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson5_shopping_category)
        lbUserName.text = intent.getStringExtra("userEmail")
    }



    fun btnLayOutClicked(view: android.view.View) {
        Toast.makeText(this, "Layout clicked", Toast.LENGTH_LONG).show()
    }

    fun btnElectronicsClick(view: android.view.View) {
        showToastCategory("Electronics")
    }

    fun btnClothingClick(view: android.view.View) {
        showToastCategory("Clothing")
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