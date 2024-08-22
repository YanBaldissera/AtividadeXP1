package exercicio3

fun main (){

    var aluno1 = Aluno("Yan", doubleArrayOf(7.0,10.0,8.8,6.0,8.0))
    var aluno2 = Aluno("Eliza", doubleArrayOf(10.0,10.0,10.0,10.0,10.0))
    var aluno3 = Aluno("Reginaldo", doubleArrayOf(7.0,10.0,8.0,6.0,8.0))
    var aluno4 = Aluno("Airton", doubleArrayOf(7.0,10.0,8.8,9.0,8.0))
    var aluno5 = Aluno("Helena", doubleArrayOf(3.0,10.0,3.8,3.0,3.0))

    aluno1.aprovado()
    aluno2.aprovado()
    aluno3.aprovado()
    aluno4.aprovado()
    aluno5.aprovado()
}

