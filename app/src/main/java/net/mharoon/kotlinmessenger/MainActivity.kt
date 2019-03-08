package net.mharoon.kotlinmessenger

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthException
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val username = usernameET.text.toString()

        registerBtn.setOnClickListener {
            val email = emailET.text.toString()
            val pwd = passwordET.text.toString()
            Log.d("MainActivity","Email is "+ email)
            Log.d("MainActivity","Password: $pwd")

            FirebaseAuth.getInstance()
                .createUserWithEmailAndPassword(email,pwd)
                .addOnCompleteListener {
                    if (! it.isSuccessful) return@addOnCompleteListener
                    Log.d("MainActivity","Successfully Logged In with uid: ${it.result.user.uid}")
                }


        }

        registerTV.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }





    }
}
