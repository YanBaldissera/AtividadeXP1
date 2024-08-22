package exercicio1.exercicio1

class verificacaoNumeros() {

    fun numerosPrimos(){
        println("Informe um número para verificar se é primo: ")
        val num = readln().toInt()
        var contagem = 0

        for (i in num downTo 1) {
            if (num % i == 0) {
                contagem++
            }
        }
        if (contagem > 2) {
            println("O número não é primo")
        }else{
            println("O número é primo")
        }
    }
}