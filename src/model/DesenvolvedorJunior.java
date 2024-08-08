package model;

public class DesenvolvedorJunior extends Desenvolvedor {

    public DesenvolvedorJunior(String nome, double salario) {
        super(nome, salario, Senioridade.JUNIOR);
    }

    public void perguntarAoSenior() {
        System.out.println("Tenho uma dúvida, pode me ajudar?");
    }

}
