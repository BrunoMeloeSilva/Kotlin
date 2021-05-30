

fun main() {
    var bruno = Gerente(123, "Bruno Silva", "11122233343", 80000.00)
    println("O funcionário ${bruno.nome} de cpf ${bruno.cpf}, tem o salário ${bruno.salario}")

    //gerando objeto anonimo
    val obj = object {
        val nome: String = "Bruno"
        val idade: Int = 22

        //pode ter comportamento e tudo..
        fun alteraIdade(idade: Int) = this.idade == idade
    }

    //gerando objeto anonimo: posso até herdar (E se tiver metodos po implementar, é só cumprir o contrato)
    val obj2 = object : Funcionario("Bruno", "12345", 100.00) {
        val idade: Int = 22

        //pode ter comportamento e tudo..
        fun alteraIdade(idade: Int) = this.idade == idade

        override fun bonificacao(): Double {
            println("Ola")
            return 2.0
        }
    }
}