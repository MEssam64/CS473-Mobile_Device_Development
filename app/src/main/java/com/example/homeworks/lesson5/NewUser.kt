package com.example.homeworks.lesson5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.homeworks.R
import kotlinx.android.synthetic.main.activity_lesson5_new_user.*

class NewUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson5_new_user)
    }

    fun btnCreateAccountClick(view: android.view.View) {
        if(txtFirstName.text.isNotEmpty() && txtLastName.text.isNotEmpty() && txtEmail.text.isNotEmpty() && txtPassword.text.isNotEmpty()){
            val intent = Intent()
            intent.putExtra("newUser", User(txtFirstName.text.toString(), txtLastName.text.toString(), txtEmail.text.toString(), txtPassword.text.toString()))
            setResult(RESULT_OK, intent)
            Toast.makeText(this, "Account  created successfully", Toast.LENGTH_SHORT).show()
            finish()
        }
        else {
            Toast.makeText(this, "Please complete all required fields", Toast.LENGTH_SHORT).show()
        }


    }
}