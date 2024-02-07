package br.com.fiap.revisao.view;

import java.util.ArrayList;
import java.util.HashMap;

public class ColecoesTeste {
    public static void main(String[] args) {
        // instanciar um lista de nome de três carros
        List<String> carros = new ArrayList<String>();

        //adicionar três carros na lista
        carros.add("Gol");
        carros.add("Jeep renegade");
        carros.add("Volkswagen voyage");


        for (String item : carros){
            System.out.println(item);
        }

        //exibir carros da lista



        Map<Integer, String> frutas = new HashMap<Integer, String>();

        frutas.put(1, "pera");
        frutas.put(2, "maçã");
        frutas.put(3, "melancia");


        //exibir as frutas

        System.out.println(frutas.get(2));

    }
}
