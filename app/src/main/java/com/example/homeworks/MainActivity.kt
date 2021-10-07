package com.example.homeworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun BtnClick(view: View) {
        var intent = Intent(this, com.example.homeworks.lesson3.MainActivity::class.java)
        startActivity(intent)
    }

    fun btnLesson4P1Click(view: android.view.View) {
        var intent = Intent(this, com.example.homeworks.lesson4.Problem1::class.java)
        startActivity(intent)
    }
    fun btnLesson4P2Click(view: android.view.View) {
        var intent = Intent(this, com.example.homeworks.lesson4.Problem2::class.java)
        startActivity(intent)
    }

    fun btnLesson5Click(view: android.view.View) {
        var intent = Intent(this, com.example.homeworks.lesson5.MainActivity::class.java)
        startActivity(intent)
    }

    fun btnLesson6P1Click(view: android.view.View) {
        var intent = Intent(this, com.example.homeworks.lesson6.Problem1::class.java)
        startActivity(intent)
    }
    fun btnLesson6P2Click(view: android.view.View) {
        var intent = Intent(this, com.example.homeworks.lesson6.ShoppingCategory::class.java)
        startActivity(intent)
    }
    fun btnLesson6P3Click(view: android.view.View) {
        var intent = Intent(this, com.example.homeworks.lesson6.ShoppingCategory::class.java)
        startActivity(intent)
    }
}