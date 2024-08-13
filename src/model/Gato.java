package model;

public class Gato extends Animal {

    private String corDoPelo;

    private String corDosOlhos;

    public Gato(String nome, String cor, String corDoPelo, String corDosOlhos) {
        super(nome, cor);
        this.corDoPelo = corDoPelo;
        this.corDosOlhos = corDosOlhos;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }


}
