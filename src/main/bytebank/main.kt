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