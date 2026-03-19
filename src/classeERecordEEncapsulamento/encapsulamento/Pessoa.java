package src.classeERecordEEncapsulamento.encapsulamento;

/*
========================================
ENCAPSULAMENTO EM JAVA
========================================

Encapsulamento é um dos pilares da Programação Orientada a Objetos (POO).

IDEIA PRINCIPAL:
-> Esconder os dados internos da classe
-> Permitir acesso controlado através de métodos

----------------------------------------
POR QUE USAR ENCAPSULAMENTO?
----------------------------------------
- Protege os dados
- Evita alterações indevidas
- Permite validar informações antes de salvar
- Mantém o controle da regra de negócio

----------------------------------------
REGRA BÁSICA:
----------------------------------------
- Atributos -> private (privados)
- Métodos -> public (acesso controlado)

----------------------------------------
EXEMPLO SEM ENCAPSULAMENTO (ERRADO)
----------------------------------------
*/

class PessoaErrada {

    // ❌ Qualquer um pode alterar diretamente
    public String nome;
    public int idade;
}

/*
PROBLEMA:
- Alguém pode fazer:
    pessoa.idade = -10;
- Isso quebra a lógica do sistema

----------------------------------------
EXEMPLO COM ENCAPSULAMENTO (CORRETO)
----------------------------------------
*/

public class Pessoa {

    /*
    ----------------------------------------
    ATRIBUTOS PRIVADOS
    ----------------------------------------
    Só podem ser acessados dentro da classe
    */
    private String nome;
    private int idade;

    /*
    ----------------------------------------
    CONSTRUTOR
    ----------------------------------------
    */
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        setIdade(idade); // usando validação
    }

    /*
    ----------------------------------------
    GETTERS (PEGAR VALOR)
    ----------------------------------------
    */
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    /*
    ----------------------------------------
    SETTERS (ALTERAR VALOR)
    ----------------------------------------
    Aqui entra a regra de negócio
    */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {

        /*
        VALIDAÇÃO:
        Impede idade inválida
        */
        if (idade < 0) {
            System.out.println("Idade não pode ser negativa!");
            return;
        }

        this.idade = idade;
    }
}

/*
----------------------------------------
USANDO A CLASSE
----------------------------------------
*/

class MainEncapsulamento {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Weslley", 25);

        // ✔ Forma correta (usando métodos)
        pessoa.setIdade(30);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        /*
        ❌ Isso NÃO funciona mais:
        pessoa.idade = -10;

        ✔ Agora o sistema está protegido
        */
    }
}
