package src.fundamentos.estruturasDeControle.switchCase;

/*
========================================
ESTRUTURA SWITCH CASE
========================================

Usada quando temos várias opções fixas
(ex: menu, dias da semana, opções numéricas)

----------------------------------------
ESTRUTURA:
----------------------------------------

switch (variavel) {
    case valor1:
        // código
        break;

    case valor2:
        // código
        break;

    default:
        // caso nenhum seja válido
}

----------------------------------------
EXEMPLO PRÁTICO
----------------------------------------
*/

public class CondicionalSwitch {

    public static void main(String[] args) {

        int dia = 3;

        switch (dia) {

            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;

            default:
                System.out.println("Dia inválido");
        }

        /*
        IMPORTANTE:
        - break evita executar os próximos casos
        - default é opcional
        */
    }
}
