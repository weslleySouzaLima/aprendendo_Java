package src.poo.classeERecordEEncapsulamento.encapsulamento;

/*
========================================
ENCAPSULAMENTO vs RECORD
========================================

RECORD:
- Já é encapsulado automaticamente
- Atributos são private final
- Não tem setter (imutável)

EXEMPLO:
*/

public record PessoaRecord(String nome, int idade) {

    /*
    Você pode validar no construtor compacto
    */
    public PessoaRecord {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade inválida");
        }
    }
}

/*
----------------------------------------
RESUMO:
----------------------------------------

Classe:
- Permite alteração (mutável)
- Usa getters/setters

Record:
- Não permite alteração (imutável)
- Mais seguro para dados simples
*/
