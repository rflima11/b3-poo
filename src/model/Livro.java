package model;

public class Livro {

    public String titulo;
    public String autor;
    public int anoPublicacao;

    public Livro() {
        this.titulo = "Titulo não informado";
        this.autor = "Autor não informado";
        this.anoPublicacao = 0;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        anoPublicacao = 0;
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirInformacoesLivro() {
        System.out.printf("Autor: %s \nTitulo: %s\nAno publicação: %s", autor, titulo, anoPublicacao);
    }
 }
