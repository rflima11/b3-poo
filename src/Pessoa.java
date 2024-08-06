import java.time.LocalDateTime;

public class Pessoa {

    private String nome;
    private int idade;
    private LocalDateTime dataHoraCriacao;

    public Pessoa(String nomeConstrutor, int idadeConstrutor) {
        if (nomeConstrutor == null) {
            throw new IllegalArgumentException("Nome não pode ser nulo");
        }
        nome = nomeConstrutor;
        idade = idadeConstrutor;
        dataHoraCriacao = LocalDateTime.now();
    }

    public Pessoa() {
        dataHoraCriacao = LocalDateTime.now();
    }

    public void apresentar() {
        System.out.println("Olá meu nome é " + nome.toUpperCase() + " e eu tenho " + idade + " anos");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (!(nome != null && nome.isBlank())) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("Idade deve ser maior que 0");
        }

    }
}
