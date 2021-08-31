package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String? = null
    var cpf: String? = null
}

fun main() {
    val gomete = Pessoa()
    gomete.nome = "gomete"
    gomete.cpf = "123"

    println(gomete.nome)
    println(gomete.cpf)

}