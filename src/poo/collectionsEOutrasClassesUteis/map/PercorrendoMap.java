package src.poo.collectionsEOutrasClassesUteis.map;

/*
========================================
PERCORRENDO MAP
========================================
*/

import java.util.HashMap;
import java.util.Map;

public class PercorrendoMap {

    public static void main(String[] args) {

        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("Arroz", 10);
        estoque.put("Feijão", 5);
        estoque.put("Macarrão", 7);

        /*
        ----------------------------------------
        1. Percorrendo chaves
        ----------------------------------------
        */
        for (String chave : estoque.keySet()) {
            System.out.println(chave);
        }

        /*
        ----------------------------------------
        2. Percorrendo valores
        ----------------------------------------
        */
        for (Integer valor : estoque.values()) {
            System.out.println(valor);
        }

        /*
        ----------------------------------------
        3. Percorrendo chave + valor (mais usado)
        ----------------------------------------
        */
        for (Map.Entry<String, Integer> item : estoque.entrySet()) {
            System.out.println(item.getKey() + " -> " + item.getValue());
        }
    }
}
