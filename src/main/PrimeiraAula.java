package main;

import model.Cumbuca;
import model.Formato;
import model.Livro;
import model.Pessoa;

public class PrimeiraAula {

    public static void main(String[] args) {

      Pessoa pessoa = new Pessoa();

//      System.out.println(pessoa.dataHoraCriacao);

/*
        model.Cumbuca cumbuca = new model.Cumbuca();
        cumbuca.formato = model.Formato.REDONDO;
        cumbuca.cor = "Rosa";
        cumbuca.peso = 200.00;
        cumbuca.encherQuantidade(200);
        cumbuca.encher();

        cumbuca.emUso();

        model.Cumbuca cumbuca2 = new model.Cumbuca();
        cumbuca2.formato = model.Formato.QUADRADO;
        cumbuca2.cor = "Vermelha";
        cumbuca2.peso = 150.00;


        cumbuca2.encher();

        cumbuca2.emUso();

        System.out.println(model.Cumbuca.composicao);*/

      Cumbuca cumbuca = new Cumbuca(Formato.REDONDO,
              "azul",
              200,
              false);

      System.out.println(cumbuca.peso);
      System.out.println(cumbuca.cor);
      System.out.println(cumbuca.estaCheia);
      System.out.println(cumbuca.formato);

      Livro livro = new Livro();

      Livro livro2 = new Livro("Gelo e Fogo", "Georg R R Martin");

      Livro livro3 = new Livro("Clean Code", "Uncle Bob", 2010);
      
      

      livro3.exibirInformacoesLivro();


    }


}
