public class PrimeiraAula {
    
    public static void main(String[] args) {

/*      Pessoa pessoa = new Pessoa();
        pessoa.nome = "Rodolfo";
        pessoa.idade = 30;
        pessoa.apresentar();*/

        Cumbuca cumbuca = new Cumbuca();
        cumbuca.formato = Formato.REDONDO;
        cumbuca.cor = "Rosa";
        cumbuca.peso = 200.00;

        cumbuca.encher();

        cumbuca.emUso();

        Cumbuca cumbuca2 = new Cumbuca();
        cumbuca2.formato = Formato.QUADRADO;
        cumbuca2.cor = "Vermelha";
        cumbuca2.peso = 150.00;


        cumbuca2.encher();

        cumbuca2.emUso();

        System.out.println(Cumbuca.composicao);

    }


}
