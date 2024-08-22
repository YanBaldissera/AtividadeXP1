package exercicio6

class Temperatura {

    fun Temperaturas(){

        println("Entre com as temperaturas do mês")
        var temperaturas = DoubleArray(30)
        var min = 0.0
        var max = 0.0
        var diamin = 0
        var diamax = 0

        for (i in temperaturas.indices) {
            println("Entre com o valor da temperatura do dia ${i + 1}: ")
            temperaturas[i] = readln().toDouble()

            if (i == 0){
                min = temperaturas[i]
                max = temperaturas[i]
            }

            when{
                temperaturas[i] < min -> {min = temperaturas[i]; diamin = i + 1}
                temperaturas[i] > max -> {max = temperaturas[i]; diamax = i + 1}
            }
        }


        var media = temperaturas.average()

        println("Com base nas temperaturas informadas")
        println("A média da temperatura é $media")
        println("A temperatura mais alta é $max no dia $diamax")
        println("A temperatura mais baixa foi $min no dia $diamin")


    }
}