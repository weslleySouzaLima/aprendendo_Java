package src.fundamentos.estruturasDeControle.whileEDoWhile;

/*
========================================
ESTRUTURA DE REPETIÇÃO - DO WHILE
========================================

Diferença principal:
-> Executa pelo menos 1 vez, mesmo que a condição seja falsa

----------------------------------------
ESTRUTURA:
----------------------------------------

do {
    // código
} while (condição);

----------------------------------------
EXEMPLO PRÁTICO
----------------------------------------
*/

public class LoopDoWhile {

    public static void main(String[] args) {

        int contador = 1;

        do {
            System.out.println("Contador: " + contador);
            contador++;

        } while (contador <= 5);

        /*
        DIFERENÇA:
        - while testa antes
        - do while testa depois
        */
    }
}
