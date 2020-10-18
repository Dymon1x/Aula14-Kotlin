package com.example.snackbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.login_body.*
import kotlinx.android.synthetic.main.login_cadastro.*


class CadastroActivity : AppCompatActivity() {
    val TAG: String = "CadastroActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        btnCadastrar.setOnClickListener {
            cadastro(getTextInfo())

        }
//
//        var name = intent.getSerializableExtra("key") as? Usuario
//        showSnack("Cadastrado o usuario ${name!!.username}")
    }
//
//    fun validaSenha(){
//        if (getTextInfo().senha != getTextInfo().senhaConfirma) {
//            when (x){
//                R.id.edPasswordCadastro -> showSnack("Senha Correta")
//                R.id.edPasswordConfirmaCadastro -> showSnack("Senha Incorreta")
//                else -> println("erro")
//            }
//        }
//    }
    
    fun getTextInfo(): Usuario{
        val nome = edNomeCadastro.text.toString()
        val email = edEmailCadastro.text.toString()
        val senha = edPassword.text.toString()
        val senhaConfirmar = edPasswordConfirmaCadastro.text.toString()
        return Usuario(nome, email, senha, senhaConfirmar)
    }

    private fun cadastro(usuario: Usuario) {
        var intent = Intent(this, LoginActivity::class.java)
        intent.putExtra("key", usuario)
        startActivity(intent)
    }

    fun showSnack(msg: String) {
        var snack = Snackbar.make(btnCadastrar, msg, Snackbar.LENGTH_SHORT)
        snack.setAction("Senha invalida", View.OnClickListener {
            Log.i(TAG, "Senha incorreta")
        })

    }

}