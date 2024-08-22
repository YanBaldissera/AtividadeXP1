package exercicio4

class OrdenacaoNomes (){

    fun Alunos() {
        println("Entre com o nome de 10 alunos ")
        var Alunos = Array(10){" "}
        for (i in Alunos.indices){
            println("Entre com o nome do aluno${i+1}: ")
            Alunos[i] = readln()
        }

        Alunos.sort()
        println("Lista de alunos ordenados: ")
        println(Alunos.joinToString())
    }
}