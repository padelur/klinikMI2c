package com.fadhlur.klinikmi2c

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fadhlur.klinikmi2c.screen.HomeDoctorsActivity

class PageLogin : AppCompatActivity() {
    private lateinit var txtSignUp : TextView
    private lateinit var btnSignin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)
        txtSignUp = findViewById(R.id.txtSignUp)
        btnSignin = findViewById(R.id.btnSignin)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtSignUp.setOnClickListener(){
            val intentPassingData = Intent(this,PageSignUp::class.java)
            startActivity(intentPassingData)
        }
        btnSignin.setOnClickListener(){
            val intentPassingData = Intent(this,HomeDoctorsActivity::class.java)
            startActivity(intentPassingData)
        }
    }
}