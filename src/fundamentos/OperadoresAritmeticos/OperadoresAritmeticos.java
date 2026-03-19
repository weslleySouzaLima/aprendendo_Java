package src.fundamentos.OperadoresAritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 🔸 Operações básicas
        int soma = a + b;           // 13
        int subtracao = a - b;      // 7
        int multiplicacao = a * b;  // 30
        int divisao = a / b;        // 3 (inteiro, perde decimal)
        int resto = a % b;          // 1 (módulo)

        System.out.println("Soma: " + soma);
        System.out.println("Divisão inteira: " + divisao);

        // 🔸 Cuidado com divisão de inteiros:
        double resultado = (double) a / b; // conversão (casting)
        System.out.println("Divisão com decimal: " + resultado);

        // 🔸 Incremento e decremento
        a++; // a = a + 1
        b--; // b = b - 1

        System.out.println("A incrementado: " + a);
        System.out.println("B decrementado: " + b);
    }
}
