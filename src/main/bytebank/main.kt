fun main(){
    print("Bem vindo ao ByteBank !\n")
    //constante
    val titular = 10
    println(titular)
    //String template
    println("titular $titular")
    //Variavel
    var variavelA = "Bruno"
    println(variavelA)
    //Varialvel declarando tipo explicitamente
    var varialvelB: String = "Maria"
    println(varialvelB)

    //chamando funcao
    testaCondicoesIF()

    //Loop N vezes determinada
    for (i in 1..3) {
        print(" $i")
    }

    //Loop N vezes determinada, de trás pra frente
    println()
    for (i in 3 downTo 1) {
        print(" $i")
    }

    //Loop N vezes determinada, de trás pra frente, pulando de 2 em 2
    println()
    for (i in 6 downTo 1 step 2) {
        print(" $i")
    }

    //Loop N vezes determinada, pode-se usar: break ou continue
    println()
    for (i in 1..3) {
        print(" $i")
        break
    }
}

fun testaCondicoesIF() {
    //IF..igual ao Java
    var saldo = -1

    if (saldo > 0){
        println("Maior que zero")
    } else if (saldo == 0){
        println("Igual a zero")
    } else{
        println("Negativa")
    }

    //é a mesma expressao logica acima
    when {
        saldo > 0 -> {
            println("Maior que zero")
        }
        saldo == 0 -> {
            println("Igual a zero")
        }
        else -> {
            println("Negativa")
        }
    }
}