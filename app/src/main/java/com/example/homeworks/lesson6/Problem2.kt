package com.example.homeworks.lesson6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.homeworks.R
import kotlinx.android.synthetic.main.activity_lesson6_problem2.*
import java.lang.StringBuilder

class Problem2 : AppCompatActivity() {
    var clothingList = arrayOf<String>("Jeans", "Jackets", "Shoes", "T-Shirts", "Sweatshirts")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson6_problem2)

        var arrayAdapter: ArrayAdapter<String> = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, clothingList)

        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "You have selected ${clothingList[i]}", Toast.LENGTH_LONG).show()
        }
    }
}