public class PrimeiraAula {

    public static void main(String[] args) {

      Pessoa pessoa = new Pessoa();

//      System.out.println(pessoa.dataHoraCriacao);

/*
        Cumbuca cumbuca = new Cumbuca();
        cumbuca.formato = Formato.REDONDO;
        cumbuca.cor = "Rosa";
        cumbuca.peso = 200.00;
        cumbuca.encherQuantidade(200);
        cumbuca.encher();

        cumbuca.emUso();

        Cumbuca cumbuca2 = new Cumbuca();
        cumbuca2.formato = Formato.QUADRADO;
        cumbuca2.cor = "Vermelha";
        cumbuca2.peso = 150.00;


        cumbuca2.encher();

        cumbuca2.emUso();

        System.out.println(Cumbuca.composicao);*/

      Cumbuca cumbuca = new Cumbuca(Formato.REDONDO,
              "azul",
              200,
              false);

      System.out.println(cumbuca.peso);
      System.out.println(cumbuca.cor);
      System.out.println(cumbuca.estaCheia);
      System.out.println(cumbuca.formato);

      String resultado = StringUtil.caixaAlta("olá esse texto estará em caixa alta");
      System.out.println(resultado);


      Livro livro = new Livro();

      Livro livro2 = new Livro("Gelo e Fogo", "Georg R R Martin");

      Livro livro3 = new Livro("Clean Code", "Uncle Bob", 2010);
      
      

      livro3.exibirInformacoesLivro();


    }


}
