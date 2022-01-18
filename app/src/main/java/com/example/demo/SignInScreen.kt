package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignInScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_screen)

    }

    fun reg(view: View) {
        val intent = Intent(this@SignInScreen,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun sign(view: View) {
        val intent = Intent(this@SignInScreen,SignUpScreen::class.java)
        startActivity(intent)
        finish()
    }
}