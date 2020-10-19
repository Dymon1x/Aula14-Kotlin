package com.example.snackbar
import java.io.Serializable

class Usuario(var id: Int, var username: String, var senha: String?): Serializable {
    override fun toString(): String {
        return "{Olá id: $id do usuario $username, senha: $senha}"
    }
}

