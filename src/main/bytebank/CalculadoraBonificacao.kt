class CalculadoraBonificacao {

    private var total: Double = 0.0

    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao()
    }

    fun registra(gerente: Gerente){
        this.total += gerente.bonificacao()
    }
}