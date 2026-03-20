package src.poo.collectionsEOutrasClassesUteis.list;

/*
========================================
ARRAYS EM JAVA
========================================

Array é uma estrutura de dados fixa.

----------------------------------------
CARACTERÍSTICAS:
----------------------------------------
- Tamanho definido na criação
- Armazena vários valores do mesmo tipo
- Acesso por índice (posição)

----------------------------------------
EXEMPLO
----------------------------------------
*/

public class ExemploArray {

    public static void main(String[] args) {

        /*
        Criando um array com tamanho 3
        */
        int[] numeros = new int[3];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        /*
        Percorrendo o array
        */
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        /*
        Outra forma (for-each)
        */
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
