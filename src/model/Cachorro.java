package model;

public class Cachorro extends Animal {

    private int numeroPatas;

    private boolean abanaRabinho;

    public Cachorro(String nome, String cor, int numeroPatas, boolean abanaRabinho) {
        super(nome, cor);
        this.numeroPatas = numeroPatas;
        this.abanaRabinho = abanaRabinho;
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU");
    }

}
