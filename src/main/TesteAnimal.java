package main;

import model.Animal;
import model.Cachorro;
import model.Gato;

public class TesteAnimal {


    public static void main(String[] args) {
        Object animal = new Animal("Animal Genérico", "marrom");
        ((Animal) animal).emitirSom();

        Object cachorro = new Cachorro("Peludinho", "Caramelo", 4, true);
        ((Animal) cachorro).emitirSom();

        Object gato = new Gato("Xanin", "Bege", "Bege com manchas", "Castanho");
        ((Animal) gato).emitirSom();

        System.out.println(animal.toString());
        System.out.println(cachorro.toString());
        System.out.println(gato.toString());


    }

}
