package main;

import model.Livro;

public class TesteLivro {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.titulo = "Gelo e Fogo";
        livro.autor = "Georg R R Martin";
        livro.anoPublicacao = 1994;

        System.out.println(livro.titulo);

        Livro livro2 = new Livro();
        livro2.titulo = "Clean Code";
        livro2.autor = "Uncle Bob";
        livro2.anoPublicacao = 2010;

        System.out.println(livro2.titulo);
    }
}
