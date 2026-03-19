package src.fundamentos.keywordsETiposPrimitivos;

public class TiposPrimitivos {

    public static void main(String[] args) {

        // 🔸 Tipos primitivos (armazenam valores simples)

        int numero = 10;         // inteiro (4 bytes)
        double preco = 19.99;   // decimal (mais preciso)
        float altura = 1.75f;   // decimal (menos preciso, precisa do 'f')
        char letra = 'A';       // caractere (aspas simples)
        boolean ativo = true;   // true ou false
        long grande = 100000L;  // números grandes (usar 'L')

        // 🔸 Keywords (palavras reservadas do Java)
        // NÃO podem ser usadas como nome de variável
        // exemplos:
        // public, class, static, void, if, else, return

        System.out.println("Numero: " + numero);
        System.out.println("Preco: " + preco);
        System.out.println("Ativo: " + ativo);
    }
}
