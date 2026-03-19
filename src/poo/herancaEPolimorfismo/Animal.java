package src.poo.herancaEPolimorfismo;

/*
========================================
HERANÇA E POLIMORFISMO (COMPLETO)
========================================

HERANÇA:
Permite que uma classe (filha) herde atributos e métodos de outra (pai).

Usamos a palavra-chave:
-> extends

OBJETIVO:
- Reutilizar código
- Evitar duplicação
- Organizar melhor o sistema

----------------------------------------
RELAÇÃO:
----------------------------------------

Cachorro É UM Animal
Gato É UM Animal

----------------------------------------
POLIMORFISMO:
----------------------------------------

Significa "muitas formas"

Permite que um mesmo método tenha comportamentos diferentes
dependendo do objeto que o executa.

----------------------------------------
OVERRIDE (SOBRESCRITA):
----------------------------------------

Quando a classe filha altera o comportamento
de um método da classe pai.

Usamos:
-> @Override

----------------------------------------
EXEMPLO COMPLETO
----------------------------------------
*/

// Classe pai
class Animal {

    public void emitirSom() {
        System.out.println("Som genérico");
    }
}

// Classe filha
class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }

    public void latir() {
        System.out.println("Au Au");
    }
}

// Outra classe filha
class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miando");
    }

    public void miar() {
        System.out.println("Miau");
    }
}

/*
----------------------------------------
USO DO POLIMORFISMO
----------------------------------------
*/

class MainHerancaPolimorfismo {

    public static void main(String[] args) {

        /*
        POLIMORFISMO:
        Uma variável do tipo Animal pode assumir
        diferentes formas (Cachorro, Gato, etc)
        */

        Animal a1 = new Cachorro();
        Animal a2 = new Gato();

        a1.emitirSom(); // Latindo
        a2.emitirSom(); // Miando

        /*
        O Java decide em tempo de execução
        qual método será executado
        */
    }
}
