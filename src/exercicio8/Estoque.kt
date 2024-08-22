package exercicio8

import java.time.LocalDate
import java.time.format.DateTimeFormatter
class Estoque {

        data class Produto(
            val nome: String,
            var quantidade: Int,
            val nivelMinimo: Int,
            val nivelMaximo: Int
        ) {
            private val historicoReposicoes = mutableListOf<Pair<String, Int>>()

            fun reporEstoque() {
                if (quantidade < nivelMinimo) {
                    quantidade = nivelMaximo
                    historicoReposicoes.add(Pair(dataAtual(), nivelMaximo))
                    println("Estoque de $nome reposto para $nivelMaximo unidades em ${dataAtual()}.")
                } else {
                    println("Estoque de $nome está acima do nível mínimo.")
                }
            }

            private fun dataAtual(): String {
                val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
                return LocalDate.now().format(formatter)
            }
        }
    }
