package src.fundamentos.estruturasDeControle.whileEDoWhile;

/*
========================================
ESTRUTURA DE REPETIÇÃO - WHILE
========================================

Usada quando NÃO sabemos quantas vezes vai repetir.

----------------------------------------
ESTRUTURA:
----------------------------------------

while (condição) {
    // código
}

----------------------------------------
EXEMPLO PRÁTICO
----------------------------------------
*/

public class LoopWhile {

    public static void main(String[] args) {

        int contador = 1;

        while (contador <= 5) {

            System.out.println("Contador: " + contador);

            contador++; // IMPORTANTE: evita loop infinito
        }

        /*
        IMPORTANTE:
        - Se esquecer o incremento -> loop infinito
        */
    }
}
