package com.example.homeworks.lesson6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homeworks.R
import kotlinx.android.synthetic.main.activity_lesson6_problem3_item_details.*

class ItemDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson6_problem3_item_details)

        val product: Product = intent.getSerializableExtra("product") as Product
        imageView.setImageResource(product.ImageResourceId)
        txtTirle.text = product.title
        txtColor.text = product.color
        txtDescription.text = product.description
    }
}