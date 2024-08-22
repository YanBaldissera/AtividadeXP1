package exercicio5

import kotlin.random.Random
class NumerosRandom() {

    fun Ramdom() {
        print("Quantas vezes você deseja lançar os dados? ")
        val numLancamentos = readLine()?.toIntOrNull() ?: 0

        repeat(numLancamentos) {
            val dado1 = Random.nextInt(1, 7)
            val dado2 = Random.nextInt(1, 7)
            val soma = dado1 + dado2
            println("Lançamento ${it + 1}: $dado1 + $dado2 = $soma")
        }
    }
}