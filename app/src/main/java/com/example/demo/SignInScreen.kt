package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class SignInScreen : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_screen)
        email = findViewById(R.id.Email)
        password = findViewById(R.id.Password)
    }

    fun reg(view: View) {
        if(Patterns.EMAIL_ADDRESS.matcher(email.text).matches() && email.text.isNotEmpty()){
            val intent = Intent(this@SignInScreen,MainActivity::class.java)
            startActivity(intent)
        }
        else{
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("Неправильно заполнено поле почты")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }
    }


    fun sign(view: View) {
        val intent = Intent(this@SignInScreen,SignUpScreen::class.java)
        startActivity(intent)
        finish()
    }
}