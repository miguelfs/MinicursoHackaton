package com.example.miguel.minicursohackaton;

/**
 * Created by miguel on 30/08/17.
 */

public class Animal {
    String especie;
    double tamanho;

    public static int numero(){
        return 1;
    }

    Animal(String espec, double tamanh){
        especie = espec;
        tamanho = tamanh;
    }

    String comer( String alimento ){
        // Cachorro comeu Hot Philadelphia
        return especie + " comeu " + alimento;
    }

}
