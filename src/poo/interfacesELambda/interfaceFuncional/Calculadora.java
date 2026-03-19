package src.poo.interfacesELambda.interfaceFuncional;

/*
========================================
INTERFACES FUNCIONAIS
========================================

Uma interface funcional tem APENAS 1 método abstrato.

Muito usada com:
-> Lambda (Java moderno)

----------------------------------------
ANNOTATION:
----------------------------------------
@FunctionalInterface

(Não é obrigatória, mas é boa prática)

----------------------------------------
EXEMPLO
----------------------------------------
*/

@FunctionalInterface
interface Calculadora {

    int calcular(int a, int b);
}

/*
----------------------------------------
USO TRADICIONAL
----------------------------------------
*/

class Soma implements Calculadora {

    @Override
    public int calcular(int a, int b) {
        return a + b;
    }
}

/*
----------------------------------------
USO COM LAMBDA
----------------------------------------
*/

class MainLambda {

    public static void main(String[] args) {

        /*
        LAMBDA:
        Implementação direta da interface
        */

        Calculadora soma = (a, b) -> a + b;

        System.out.println(soma.calcular(2, 3));

        /*
        EXPLICAÇÃO:
        (a, b) -> a + b

        - parâmetros
        - ->
        - retorno
        */
    }
}
