package model;

public class Animal {

    private String nome;

    private String cor;

    public Animal(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
        System.out.println("Chamando o construtor da classe animal");
    }

    public void emitirSom() {
        System.out.println("Animal está emitindo som");
    }

    @Override
    public String toString() {
        return "Olá meu nome é " + nome;
    }


}
