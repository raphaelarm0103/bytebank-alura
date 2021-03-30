package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.interfaces.Autenticavel

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: Int
): Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}