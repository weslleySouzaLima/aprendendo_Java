package src.fundamentos.estruturasDeControle.condicaoFor;

/*
========================================
ESTRUTURA DE REPETIÇÃO - FOR
========================================

Usada quando sabemos quantas vezes o código vai repetir.

----------------------------------------
ESTRUTURA:
----------------------------------------

for (início; condição; incremento) {
    // código
}

----------------------------------------
EXEMPLO PRÁTICO
----------------------------------------
*/

public class LoopFor {

    public static void main(String[] args) {

        /*
        Contar de 1 até 5
        */

        for (int i = 1; i <= 5; i++) {

            System.out.println("Número: " + i);
        }

        /*
        EXPLICAÇÃO:
        - int i = 1 -> começa em 1
        - i <= 5    -> vai até 5
        - i++       -> incrementa de 1 em 1
        */
    }
}
