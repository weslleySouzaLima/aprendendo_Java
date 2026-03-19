package src.poo.herancaEPolimorfismo;

/*
========================================
INSTANCEOF
========================================

Verifica o tipo real do objeto em tempo de execução

----------------------------------------
QUANDO USAR:
----------------------------------------
- Quando precisa identificar o tipo específico
- Deve ser evitado em excesso (prefira polimorfismo)
*/

class MainInstanceOf {

    public static void main(String[] args) {

        Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            System.out.println("É um cachorro");
        }

        if (animal instanceof Gato) {
            System.out.println("É um gato");
        }
    }
}
