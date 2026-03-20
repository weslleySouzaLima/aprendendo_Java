package src.poo.collectionsEOutrasClassesUteis.map;

/*
========================================
MAP EM JAVA
========================================

Map é uma estrutura que armazena dados no formato:

CHAVE -> VALOR

Exemplo:
"nome" -> "Weslley"
"idade" -> 25

----------------------------------------
CARACTERÍSTICAS:
----------------------------------------
- Não permite chaves duplicadas
- Cada chave aponta para um valor
- Muito usado para busca rápida

----------------------------------------
IMPORTAÇÃO:
----------------------------------------
import java.util.Map;
import java.util.HashMap;
*/

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args) {

        /*
        Criando um Map
        */
        Map<String, String> pessoa = new HashMap<>();

        /*
        Adicionando valores
        */
        pessoa.put("nome", "Weslley");
        pessoa.put("cidade", "Curitiba");
        pessoa.put("profissao", "Dev");

        /*
        Acessando valor pela chave
        */
        System.out.println(pessoa.get("nome"));

        /*
        Sobrescrevendo valor
        */
        pessoa.put("nome", "João");

        /*
        Verificando se existe chave
        */
        if (pessoa.containsKey("cidade")) {
            System.out.println("Cidade existe");
        }

        /*
        Removendo elemento
        */
        pessoa.remove("profissao");

        /*
        Tamanho do Map
        */
        System.out.println(pessoa.size());
    }
}
