package com.example.homeworks.lesson6

import java.io.Serializable

data class Product(val itemId: Int, val title: String, val price: Double, val color: String, val ImageResourceId: Int, val description: String) : Serializable
