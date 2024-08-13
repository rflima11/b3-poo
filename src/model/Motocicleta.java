package model;

public class Motocicleta extends Veiculo {

    private int cilindradas;

    public Motocicleta(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando");
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Cilindradas: " + cilindradas);
    }
}
