package exercicio2

fun contarPalavras(texto: String): Int {
    val palavras = texto.trim().split("\\s+".toRegex())
    return palavras.size
}