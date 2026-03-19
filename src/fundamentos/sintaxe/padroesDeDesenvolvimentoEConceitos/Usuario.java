package src.fundamentos.padroesDeDesenvolvimentoEConceitos;

public class Usuario {

    // 🔸 Encapsulamento:
    // atributos privados (não acessados diretamente fora da classe)
    private String nome;
    private int idade;

    // 🔸 Construtor:
    // usado para criar o objeto já com valores
    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // 🔸 Getter:
    // método para acessar o valor de forma controlada
    public String getNome() {
        return nome;
    }

    // 🔸 Responsabilidade única:
    // esse método faz apenas uma coisa: mostrar dados
    public void exibirDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    public static void main(String[] args) {

        // 🔸 Criando objeto da classe
        Usuario user = new Usuario("Weslley", 25);

        // 🔸 Chamando método
        user.exibirDados();

        // 🔸 Boa prática:
        // nomes claros e objetivos (evite: x, y, z)
    }
}
