class Gerente(
    var senha: Int,
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        this.senha = senha
        return true
    }

    override fun bonificacao(): Double {
        return salario * 0.2
    }
}