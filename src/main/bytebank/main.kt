fun main() {
    //Teste Objetos
    val conta = Conta("Bruno Silva", 120.32)
    conta.deposita(100.32)


}

class Conta(var titular: String, var saldo: Double) {
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