package com.example.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var usuario = intent.getSerializableExtra("key") as? Usuario
        showToast("Bem vindo ${usuario!!.username}")
    }

    fun showToast(msg: String){
        Toast.makeText(this,msg, Toast.LENGTH_LONG).show()
    }
}