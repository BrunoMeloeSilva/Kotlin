import jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java

import Java.lang.String as stringJava
import kotlin.String as stringKotrlin

fun main() {
    var bruno = Gerente(123, "Bruno Silva", "11122233343", 80000.00)
    println("O funcionário ${bruno.nome} de cpf ${bruno.cpf}, tem o salário ${bruno.salario}")
    val msg : stringJava = "Bruno"
    val msg2 : stringKotrlin = "Kotlin"

}