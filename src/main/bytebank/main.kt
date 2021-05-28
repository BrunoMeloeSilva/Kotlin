fun main() {
    //Teste Objetos
    val conta = Conta("Bruno Silva", 120.32)
    val conta2 = Conta(saldo = 100.00, titular = "Keule Fabiana")
    conta.deposita(100.32)
    println(conta.saldo)


}

class Conta(var titular: String, var saldo: Double = 0.0) {
    var numero = 0
        get() { return field }
        private set(value) {
            field = value
        }

    fun deposita(valor: Double) {
        saldo += valor;
    }

    fun saca(valor: Double) {
        saldo -= valor
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false

    }
}