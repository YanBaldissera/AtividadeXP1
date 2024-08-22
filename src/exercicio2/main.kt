package exercicio2

fun main() {
    println("Digite um texto: ")
    var texto = readln()

    var contador = contarPalavras(texto)
    println("O valor de palavras foi $contador.")
}

