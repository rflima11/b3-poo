package exercicios;

import model.Pessoa;

public class ExercicioTres {

/*  * A partir da classe model.Pessoa criada na primeira aula, altere os modificadores de acesso de cada atributo
    para que sejam acessíveis apenas a partir da própria classe e crie métodos getters e setters para cada um deles.

    * Crie uma classe com um método main para criar uma instância da classe model.Pessoa utilizando os métodos criados.


    public class model.Pessoa {

        String nome;
        int idade;

        //construtor

    }*/

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Rodolfo");
        pessoa.setIdade(-30);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

    }
}
