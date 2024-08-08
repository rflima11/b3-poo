package model;

public class Desenvolvedor extends Funcionario {

    private Senioridade senioridade;

    public Desenvolvedor(String nome, double salario, Senioridade senioridade) {
        super(nome, salario);
        this.senioridade = senioridade;
    }

    public void criarSoftware() {
        System.out.println("Desenvolvedor de nível " + senioridade + " " + this.getNome() + "  está codificando um software");
    }

}
