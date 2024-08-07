package main;

import model.Conta;

public class TesteConta {


    public static void main(String[] args) {

        Conta contaDoRodolfo = new Conta(
                "Rodolfo",
                "771371"
        );

        Conta contaDoJonathan = new Conta(
                "Jonathan",
                "2362134"
        );


        contaDoRodolfo.depositar(1000.00);

        contaDoRodolfo.transferir(contaDoJonathan, 10);

        System.out.println("O saldo da conta do Rodolfo é: " + contaDoRodolfo.getSaldo());

        System.out.println("O saldo da conta do Jonathan é: " + contaDoJonathan.getSaldo());

        contaDoJonathan.transferir(contaDoRodolfo, 30);

        //modificador que não funciona mais após a adição do private no atributo saldo
        //contaDoRodolfo.saldo = 10000.00;
        //System.out.println(contaDoRodolfo.saldo);


    }
}
