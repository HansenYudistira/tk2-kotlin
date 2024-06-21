package com.example.tugaskelompok2

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: TextInputEditText
    private lateinit var passwordEditText: TextInputEditText
    private lateinit var loginButton: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showLoginLayout()
    }

    private fun showLoginLayout() {
        setContentView(R.layout.activity_main)
        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username == "pengguna" && password == "masuk") {
                showCatalogLayout()
            } else {
                Toast.makeText(this, "Login gagal, coba lagi.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun showCatalogLayout() {
        setContentView(R.layout.activity_catalog)
    }
}
