package exercicios;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import model.Carro;
import model.Motocicleta;
import model.Veiculo;
public class ExercicioQuatro {

    public static void main(String[] args) {

        ArrayList<Veiculo> veiculos = new ArrayList<>();

        Veiculo veiculo = new Veiculo("Marca Generica",
                "Carroça",
                1994);

        Veiculo carro = new Carro("Chevrolet", "Celta", 2007, 2);

        Veiculo motocicleta = new Motocicleta("Shineray", "jet-50", 2010, 50);

        veiculos.add(veiculo);
        veiculos.add(motocicleta);
        veiculos.add(carro);

        for(Veiculo veiculoArray : veiculos) {
            veiculoArray.acelerar();
            veiculoArray.mostrarDetalhes();
        }

    }
}
