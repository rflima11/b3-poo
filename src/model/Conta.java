package model;

public class Conta {

    private String titular;

    private String numero;

    private double saldo;

    public Conta(String titular,
                 String numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito < 0) {
            throw new IllegalArgumentException("Por favor, deposite um valor positivo");
        } else {
            this.saldo += valorDeposito;
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque < 0) {
            throw new IllegalArgumentException("Por favor, saque um valor positivo");
        } else if (this.saldo >= valorSaque) {
            this.saldo -= valorSaque;
        } else {
            throw new IllegalArgumentException("model.Conta não tem saldo disponível");
        }
    }

    public void transferir(Conta contaDestino, double valorTransferencia) {
        if (contaDestino == null) {
            throw new IllegalArgumentException("model.Conta não pode ser nulo");
        }

        if (this.saldo >= valorTransferencia) {
            contaDestino.depositar(valorTransferencia);
            this.saldo -= valorTransferencia;
        } else {
            throw new IllegalArgumentException("Não há saldo disponível");
        }
    }

    public String getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
