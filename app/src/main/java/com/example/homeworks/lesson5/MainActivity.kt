package com.example.homeworks.lesson5

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.homeworks.R
import kotlinx.android.synthetic.main.activity_lesson5_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var list : MutableList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson5_main)
        list = ArrayList<User>()

        list.add(User("Renuka","Mohanraj","rmohanraj@miu.edu","123456"))
        list.add(User("Mohamed","Abdelzaher","MAbdelzaher@miu.edu","123456"))
        list.add(User("Zolzaya","Bayantsogt","ZBayantsogt@miu.edu","123456"))
        list.add(User("Baibing","Song","bsong@miu.edu","123456"))
        list.add(User("Asrat","Kelilew","akelilew@miu.edu", "123456"))

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

            if (resultCode == Activity.RESULT_OK) {
                list.add(data?.getSerializableExtra("newUser") as User)
            }
    }

    fun btnSignIn(view: android.view.View) {
        if(txtPassword.text.isNotEmpty() && txtEmail.text.isNotEmpty()) {
            var result = list.find { u -> u.email.lowercase() == txtEmail.text.toString().lowercase()
                    && u.password.lowercase() == txtPassword.text.toString().lowercase()
            }
            if(result != null) {
                var intent = Intent(this, ShoppingCategory ::class.java)
                intent.putExtra("userEmail", result.email)
                txtEmail.text.clear()
                txtPassword.text.clear()
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Wrong email or password", Toast.LENGTH_LONG).show()
            }
        }
        else
        {
            Toast.makeText(this, "Please fill email and password", Toast.LENGTH_LONG).show()
        }
    }

    fun btnNewUser(view: android.view.View) {
        var intent = Intent(this, NewUser::class.java)
        startActivityForResult(intent, 1)
    }

    fun btnForgetPassword(view: android.view.View) {
        if(txtEmail.text.isNotEmpty()){
            var result = list.find { u -> u.email.lowercase() == txtEmail.text.toString().lowercase() }

            if(result != null) {
                val intent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:") // only email apps should handle this
                    putExtra(Intent.EXTRA_EMAIL, result.email)
                    putExtra(Intent.EXTRA_SUBJECT, "Your user password")
                    putExtra(Intent.EXTRA_TEXT, "Your password is: " + result.password)
                }
                if (intent.resolveActivity(packageManager) != null) {
                    startActivity(intent)
                }
            }
            else {
                Toast.makeText(this, "Your email doesn't exist", Toast.LENGTH_SHORT).show()
            }

        }
        else {
            Toast.makeText(this, "Please fill email", Toast.LENGTH_LONG).show()
        }

    }
}