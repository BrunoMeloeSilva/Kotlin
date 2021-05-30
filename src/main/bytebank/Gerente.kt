class Gerente(
    var senha: Int,
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario), Autenticavel {

    //é uma forma de criar propriedade de classe, mas é a mesma ideia do objeto singonton.
    //O modificador companion é para que seus atributos estejam visiveis para a classe
    ////onde está declarada este singonton, no caso aqui, Gerente.
    ///Portanto o setters é privado a nivel da classe Gerente.
    // Eu nem precisaria nomear este companion object com o nome Contador, mas é bom batizar.
    companion object Contator {
        var total = 0
            private set
    }

    init {
        //Ao usar companion object, as propriedades do objeto anonimo
        ////se comportam como se fosse da classe, Gerente.
        Contator.total += 1
        println("Total = ${Contator.total}")
        println("Init Gerente")
    }
    override fun autentica(senha: Int): Boolean {
        this.senha = senha
        return true
    }

    override fun bonificacao(): Double {
        return salario * 0.2
    }
}