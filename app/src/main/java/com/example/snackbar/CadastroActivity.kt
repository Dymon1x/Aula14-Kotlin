package com.example.snackbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.login_body.*
import kotlinx.android.synthetic.main.login_cadastro.*


class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        btnCadastrar.setOnClickListener {
            getTextInfo()
        }
    }


    fun getTextInfo(): Usuario {
        val nome = edNomeCadastro.text.toString()
        val email = edEmailCadastro.text.toString()
        val senha = edPassword.text.toString()
        val senhaConfirmar = edPasswordConfirmaCadastro.text.toString()

        if (checkSenha(senha, senhaConfirmar)){
            callActivity()
        } else{
            showSnackbar("As senhas não são iguais")
        }
        return Usuario(1, nome, senha)
    }

    fun checkSenha(n1: String, n2: String): Boolean{
        return n1 == n2
    }

    fun callActivity() {
        var intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }


    fun showSnackbar(msg: String) {
        var snack = Snackbar.make(homeCadastro, msg, Snackbar.LENGTH_LONG)
        snack.setAction("OK", View.OnClickListener {

        })
        snack.show()
    }

}