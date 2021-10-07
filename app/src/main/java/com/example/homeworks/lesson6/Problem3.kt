package com.example.homeworks.lesson6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homeworks.R
import kotlinx.android.synthetic.main.activity_lesson6_problem3_main.*

class Problem3 : AppCompatActivity() {
    lateinit var products: ArrayList<Product>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson6_problem3_main)

        products = ArrayList<Product>()

        products.add(Product(   1,"Samsung Galaxy tab7", 500.0, "Black",R.drawable.tablet, "Samsung galaxy tab7 128 GB black"))
        products.add(Product(   2,"MacBook Pro 16", 1700.0, "Silver",R.drawable.macbook, "MacBook pro 16inch Silver 512GB SSD"))
        products.add(Product(   3,"LG 43\" TV", 750.0, "White",R.drawable.lgtv, "LG TV 43\" UHD"))
        products.add(Product(   4,"Hp Envy printer", 110.0, "Black",R.drawable.hpenvy, "HP ENVY photo 7164 All-In-One"))
        products.add(Product(   5,"Note 20 ulta", 1199.0, "Black",R.drawable.note20ultra, "Samsung Note 20 ultra 5G 128GB"))

        recycleView.layoutManager = LinearLayoutManager(this)

        val adapter = RecyclerViewAdapter(products)

        recycleView.adapter = adapter


    }
}