package com.example.snackbar
import java.io.Serializable

class Usuario(var username: String, var email: String?, var senha: String?, var senhaConfirma: String?): Serializable {
    override fun toString(): String {
        return "{Olá usuario $username, email: $email, senha: $senha}"
    }

}

