package src.fundamentos.OperadoresBitwise;

public class OperadoresBitwise {

    public static void main(String[] args) {

        int a = 5; // binário: 0101
        int b = 3; // binário: 0011

        // 🔸 AND (&)
        // compara bit a bit → só 1 se ambos forem 1
        int and = a & b; // 0001 = 1

        // 🔸 OR (|)
        // 1 se pelo menos um for 1
        int or = a | b; // 0111 = 7

        // 🔸 XOR (^)
        // 1 se forem diferentes
        int xor = a ^ b; // 0110 = 6

        // 🔸 NOT (~)
        // inverte todos os bits (complemento de 2)
        int not = ~a;

        System.out.println("AND: " + and);
        System.out.println("OR: " + or);
        System.out.println("XOR: " + xor);
        System.out.println("NOT: " + not);

        // 🔸 Shift (muito usado também)

        int esquerda = a << 1; // desloca bits pra esquerda (multiplica por 2)
        int direita = a >> 1;  // desloca bits pra direita (divide por 2)

        System.out.println("Left Shift: " + esquerda);
        System.out.println("Right Shift: " + direita);

        // 🔸 Uso real:
        // otimização, criptografia, manipulação de flags
    }
}
