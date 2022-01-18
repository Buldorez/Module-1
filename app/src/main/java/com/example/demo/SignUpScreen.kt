package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class SignUpScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)
    }
    fun Reg(view: android.view.View) {
        Toast.makeText(this,"Аккаунт создан", Toast.LENGTH_SHORT).show()
        val intent = Intent(this@SignUpScreen,SignInScreen::class.java)
        startActivity(intent)
        finish()
    }
    fun Sign(view: android.view.View) {
        val intent = Intent(this@SignUpScreen,SignInScreen::class.java)
        startActivity(intent)
        finish()
    }

}