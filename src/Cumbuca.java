public class Cumbuca {

    static String composicao = "PLÁSTICO";

    //valor default: null
    Formato formato;

    //valor default: null
    String cor;

    //valor default: 0.0
    double peso;

    //valor default: false;
    boolean estaCheia;

    public void encher() {
        estaCheia = true;
    }

    public void emUso() {
        if (estaCheia) {
            System.out.println("Cumbuca está cheia");
        } else {
            System.out.println("Cumbuca está vazia");
        }
    }
}
