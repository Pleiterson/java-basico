package one.digitalinnovation.classes.pessoa;

import one.digitalinnovation.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {
    public static void main(String[] args) {
        final var batman = new SuperUsuario("batman", "1234%$#@");

        batman.getLogin();
        //batman.getSenha();    // apresentará erro, pois a senha é definida como protected e não como public
        //String nomeDoCliente = batman.nome; //ERRO
    }
}