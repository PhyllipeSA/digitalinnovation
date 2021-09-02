package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista("Joao Pedro", "123456789", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}
