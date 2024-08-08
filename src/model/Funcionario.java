package model;


public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {

    }

    public void trabalhar() {
        System.out.println("O funcionário " + this.nome + " está trabalhando");
    }

    public String getNome() {
        return this.nome;
    }


}
