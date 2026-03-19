package src.fundamentos.sintaxe.OperadoresDeAtribuicaoELogicos;

public class OperadoresLogicos {

    public static void main(String[] args) {

        // 🔸 Operadores de atribuição

        int x = 10; // atribui valor 10

        x += 5; // x = x + 5
        x -= 2; // x = x - 2
        x *= 2; // x = x * 2
        x /= 2; // x = x / 2

        System.out.println("Valor final de x: " + x);

        // 🔸 Operadores lógicos (trabalham com boolean)

        boolean condicao1 = true;
        boolean condicao2 = false;

        // AND (&&) → só é true se ambos forem true
        System.out.println(condicao1 && condicao2); // false

        // OR (||) → true se pelo menos um for true
        System.out.println(condicao1 || condicao2); // true

        // NOT (!) → inverte o valor
        System.out.println(!condicao1); // false

        // 🔸 Uso prático com if
        if (condicao1 && !condicao2) {
            System.out.println("Entrou no IF");
        }
    }
}
