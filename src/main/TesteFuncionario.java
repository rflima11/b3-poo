package main;

import model.Desenvolvedor;
import model.DesenvolvedorJunior;
import model.Funcionario;
import model.Senioridade;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Rodolfo", 1500);

        funcionario.trabalhar();


        Desenvolvedor desenvolvedor = new Desenvolvedor("Rogerio", 3000, Senioridade.JUNIOR);

        desenvolvedor.trabalhar();
        desenvolvedor.criarSoftware();

        DesenvolvedorJunior desenvolvedorJunior = new DesenvolvedorJunior(
                "Lucas",
                5000
        );

        desenvolvedorJunior.trabalhar();
        desenvolvedorJunior.criarSoftware();
        desenvolvedorJunior.perguntarAoSenior();
        desenvolvedorJunior.toString();
    }

}
