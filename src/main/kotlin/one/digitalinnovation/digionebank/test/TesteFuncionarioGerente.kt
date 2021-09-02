package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria do Carmo", "123456789", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}