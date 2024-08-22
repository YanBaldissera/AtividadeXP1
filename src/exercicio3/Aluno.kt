package exercicio3

class Aluno (var aluno: String, var nota : DoubleArray) {

    fun aprovado(){
        if (nota.average() >= 7.0){
            println("Aluno $aluno aprovado")
        }else{
            println("Aluno $aluno reprovado")
        }
    }
}