package src.poo.classeERecordEEncapsulamento.record;

/*
========================================
RECORDS EM JAVA - EXPLICAÇÃO COMPLETA
========================================

Records foram introduzidos no Java 14 (oficial no Java 16).

Eles são usados para representar objetos IMUTÁVEIS
(ou seja, os dados não mudam depois de criados).

----------------------------------------
QUANDO USAR RECORD?
----------------------------------------
- Quando a classe só armazena dados
- Quando você não precisa alterar os valores
- Para reduzir código (menos boilerplate)

----------------------------------------
O QUE O RECORD FAZ AUTOMATICAMENTE:
----------------------------------------
- Cria atributos privados e finais
- Cria construtor
- Cria getters
- Cria toString()
- Cria equals() e hashCode()

----------------------------------------
SINTAXE DE UM RECORD
----------------------------------------
*/

public record PessoaRecord(String nome, int idade) {

    /*
    Você pode adicionar comportamentos também
    (métodos), mas NÃO pode mudar os atributos
    */

    public String apresentar() {
        return "Meu nome é " + nome + " e tenho " + idade + " anos.";
    }
}

/*
----------------------------------------
COMO USAR O RECORD
----------------------------------------
*/

class MainRecord {
    public static void main(String[] args) {

        PessoaRecord pessoa = new PessoaRecord("Weslley", 25);

        // Acessando valores (sem getNome())
        System.out.println(pessoa.nome());
        System.out.println(pessoa.idade());

        // Chamando método
        System.out.println(pessoa.apresentar());
    }
}
