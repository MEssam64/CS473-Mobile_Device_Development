package com.example.homeworks.lesson6

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.homeworks.R
import kotlinx.android.synthetic.main.activity_lesson6_problem3_item_per_rv.view.*
import org.w3c.dom.Text

class RecyclerViewAdapter(var prodcuts: ArrayList<Product>) : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_lesson6_problem3_item_per_rv,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtColor.text = prodcuts[position].color
        holder.txtTitle.text = prodcuts[position].title
        holder.txtPrice.text = prodcuts[position].price.toString()
        holder.imageView.setImageResource(prodcuts[position].ImageResourceId)
        holder.bind(prodcuts[position])
    }

    override fun getItemCount(): Int {
        return prodcuts.size
    }



    class MyViewHolder(var itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtColor: TextView = itemView.findViewById(R.id.txtColor)
        var imageView: ImageView = itemView.findViewById(R.id.imageView)
        var txtTitle: TextView = itemView.findViewById(R.id.txtTitle)
        var txtPrice: TextView = itemView.findViewById(R.id.txtPrice)

        fun bind(prodcut: Product){
            itemView.setOnClickListener {
                var intent = Intent(itemView.context, ItemDetails::class.java)
                intent.putExtra("product",prodcut)
                itemView.context.startActivity(intent)
            }
        }
    }
}