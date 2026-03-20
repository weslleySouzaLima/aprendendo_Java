package src.poo.collectionsEOutrasClassesUteis.set;

/*
========================================
SET EM JAVA
========================================

Set é uma coleção que NÃO permite elementos duplicados.

----------------------------------------
CARACTERÍSTICAS:
----------------------------------------
- Não aceita valores repetidos
- Não garante ordem (depende da implementação)
- Muito usado para validação e controle

----------------------------------------
IMPORTAÇÃO:
----------------------------------------
import java.util.Set;
import java.util.HashSet;
*/

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

    public static void main(String[] args) {

        Set<String> nomes = new HashSet<>();

        nomes.add("Weslley");
        nomes.add("João");
        nomes.add("Maria");

        /*
        Tentando adicionar duplicado
        */
        nomes.add("Weslley"); // NÃO será adicionado

        /*
        Percorrendo
        */
        for (String nome : nomes) {
            System.out.println(nome);
        }

        /*
        Verificando se existe
        */
        if (nomes.contains("João")) {
            System.out.println("Nome encontrado");
        }

        /*
        Removendo
        */
        nomes.remove("Maria");
    }
}
