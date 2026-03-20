package src.poo.collectionsEOutrasClassesUteis.map;

/*
========================================
EXEMPLO REAL (BACKEND)
========================================

Simulando um cadastro de usuários
*/

import java.util.HashMap;
import java.util.Map;

class Usuario {

    String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }
}

public class ExemploUsuarios {

    public static void main(String[] args) {

        /*
        ID -> Usuario
        */
        Map<Integer, Usuario> usuarios = new HashMap<>();

        usuarios.put(1, new Usuario("Weslley"));
        usuarios.put(2, new Usuario("Maria"));

        /*
        Buscando usuário pelo ID
        */
        Usuario u = usuarios.get(1);

        System.out.println(u.nome);

        /*
        Isso é MUITO usado em:
        - APIs
        - banco de dados
        - cache
        */
    }
}
