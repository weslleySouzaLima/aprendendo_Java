package src.fundamentos.estruturasDeControle.ifElse;

/*
========================================
ESTRUTURA CONDICIONAL - IF / ELSE IF / ELSE
========================================

Usada para tomar decisões no código.

----------------------------------------
ESTRUTURA:
----------------------------------------

if (condição) {
    // executa se for verdadeiro
} else if (outra condição) {
    // executa se a segunda condição for verdadeira
} else {
    // executa se nenhuma condição for verdadeira
}

----------------------------------------
EXEMPLO PRÁTICO
----------------------------------------
*/

public class CondicionalIf {

    public static void main(String[] args) {

        int idade = 18;

        /*
        REGRAS:
        - >= 18 -> maior de idade
        - >= 16 -> pode votar
        - < 16  -> menor
        */

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else if (idade >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Menor de idade");
        }

        /*
        IMPORTANTE:
        - O código para no primeiro if verdadeiro
        */
    }
}
