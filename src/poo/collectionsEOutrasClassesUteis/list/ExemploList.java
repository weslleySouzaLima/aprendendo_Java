package src.poo.collectionsEOutrasClassesUteis.list;

/*
========================================
LIST (ARRAYLIST)
========================================

List é uma coleção dinâmica (tamanho variável).

----------------------------------------
VANTAGENS SOBRE ARRAY:
----------------------------------------
- Cresce automaticamente
- Tem métodos prontos
- Mais usado no mercado

----------------------------------------
IMPORTAÇÃO:
----------------------------------------
import java.util.List;
import java.util.ArrayList;
*/

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        /*
        Criando uma lista
        */
        List<String> nomes = new ArrayList<>();

        /*
        Adicionando elementos
        */
        nomes.add("Weslley");
        nomes.add("João");
        nomes.add("Maria");

        /*
        Acessando elemento
        */
        System.out.println(nomes.get(0));

        /*
        Percorrendo lista
        */
        for (String nome : nomes) {
            System.out.println(nome);
        }

        /*
        Removendo elemento
        */
        nomes.remove("João");

        /*
        Tamanho da lista
        */
        System.out.println(nomes.size());
    }
}
