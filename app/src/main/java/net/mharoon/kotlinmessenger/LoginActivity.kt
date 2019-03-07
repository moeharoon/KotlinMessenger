package net.mharoon.kotlinmessenger

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtn.setOnClickListener{
            val email   = loginEmailET.text.toString()
            val pwd     = loginPasswordET.text.toString()

            Log.d("Login","Attempt to login with email/pwd: $email/$pwd")
        }
        login_back2registerTV.setOnClickListener() {
            finish()
        }
    }


}