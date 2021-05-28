fun main(){
    constantesVariaveis()
    //chamando funcao
    testaCondicoesIF()
    testaLoops()
    println()
    //Objetos
    testaObjetos()
    //Teste Objetos
    val conta = Conta()
    deposita(conta, 100.32)
    println(conta.saldo)
}

fun deposita(conta: Conta, valor: Double){
    conta.saldo += valor;
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaObjetos(){
    val contaBruno = Conta()
    contaBruno.titular = "Bruno Silva"
    println(contaBruno.titular)
    val contaMaria = Conta()
    contaMaria.titular = "Maria Silva"
    println("Titular da conta é ${contaMaria.titular}")
}
fun constantesVariaveis() {
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

fun testaLoops() {
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