package model;

public class Cumbuca {

    static int quantidadeDeCumbucas = 0;

    //valor default: null
    public Formato formato;

    //valor default: null
    public String cor;

    //valor default: 0.0
    public double peso;

    //valor default: false;
    public boolean estaCheia;

    public Cumbuca(Formato formato, String cor, double peso, boolean estaCheia) {
        this.formato = formato;
        this.cor = cor;
        this.peso = peso;
        this.estaCheia = estaCheia;
        quantidadeDeCumbucas++;
    }

    public void encher() {
        estaCheia = true;
    }

    public void encherQuantidade(double quantidadePassada) {
        peso += quantidadePassada;
    }

    public void emUso() {
        if (estaCheia) {
            System.out.println("model.Cumbuca está cheia");
        } else {
            System.out.println("model.Cumbuca está vazia");
        }
    }


}
