class Gerente(
    var senha: Int,
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {

    fun autentica(senha: Int) {
        this.senha = senha
    }

    override fun bonificacao(): Double {
        return super.bonificacao() * salario * 0.2
    }
}