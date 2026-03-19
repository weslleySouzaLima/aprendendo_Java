package src.poo.classeERecordEEncapsulamento.classe;

/*
========================================
            CLASSES EM JAVA
========================================

Uma classe é o "molde" (template) para criar objetos.

Ela define:
- Atributos (variáveis / estado)
- Métodos (comportamentos / ações)

Pense assim:
Classe = Planta de uma casa
Objeto = Casa construída

----------------------------------------
ESTRUTURA BÁSICA DE UMA CLASSE
----------------------------------------
*/
public class Pessoa {

    /*
    ----------------------------------------
    ATRIBUTOS (VARIÁVEIS DA CLASSE)
    ----------------------------------------
    Representam características do objeto
    */
    String nome;
    int idade;

    /*
    ----------------------------------------
    CONSTRUTOR
    ----------------------------------------
    Método especial chamado ao criar o objeto.
    Serve para inicializar os atributos.
    */
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    /*
    ----------------------------------------
    MÉTODO
    ----------------------------------------
    Representa uma ação do objeto
    */
    public void apresentar() {
        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
/*
----------------------------------------
COMO USAR A CLASSE (MAIN)
----------------------------------------
*/

    class Main {
        public static void main(String[] args) {

            // Criando um objeto da classe Pessoa
            Pessoa pessoa = new Pessoa("Weslley", 25);

            // Chamando método
            pessoa.apresentar();
        }
    }

