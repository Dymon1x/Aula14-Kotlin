package com.example.snackbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.login_body.*
import kotlinx.android.synthetic.main.login_body.edPassword
import kotlinx.android.synthetic.main.login_body.edUserName

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            novaTelaLogin(getInfoUserLogin())
        }

        tv_cadastre_se.setOnClickListener {
            cadastrando(getInfoUserCadastro())
        }
    }

    fun getInfoUserLogin(): Usuario {
        val username = edUserName.text.toString()
        val senha = edPassword.text.toString()

        return Usuario(username, null, senha, null)
    }

     fun novaTelaLogin(usuario: Usuario) {
        var intent = Intent(this, MainActivity::class.java)
        intent.putExtra("key", usuario)
        startActivity(intent)
    }


    fun getInfoUserCadastro(){
    }

   private fun cadastrando(infoUserCadastro: Unit) {
        var intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
    }

}
