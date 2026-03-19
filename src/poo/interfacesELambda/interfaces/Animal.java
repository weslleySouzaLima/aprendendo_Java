package src.poo.interfacesELambda.interfaces;

/*
========================================
INTERFACES EM JAVA
========================================

Uma interface é um "contrato".

Ela define O QUE uma classe deve fazer,
mas NÃO COMO fazer.

----------------------------------------
OBJETIVO:
----------------------------------------
- Padronizar comportamentos
- Permitir múltiplas implementações
- Aumentar desacoplamento

----------------------------------------
PALAVRAS-CHAVE:
----------------------------------------
- interface
- implements

----------------------------------------
EXEMPLO
----------------------------------------
*/

// Interface (contrato)
interface Animal {

    void emitirSom(); // método abstrato (sem corpo)
}

/*
----------------------------------------
CLASSES IMPLEMENTANDO A INTERFACE
----------------------------------------
*/

class Cachorro implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }
}

class Gato implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miando");
    }
}

/*
----------------------------------------
USO
----------------------------------------
*/

class MainInterface {

    public static void main(String[] args) {

        Animal a1 = new Cachorro();
        Animal a2 = new Gato();

        a1.emitirSom();
        a2.emitirSom();

        /*
        POLIMORFISMO COM INTERFACE
        */
    }
}
