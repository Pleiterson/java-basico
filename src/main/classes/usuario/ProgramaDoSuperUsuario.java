// classes com nomes compostos, sempre a primeira letra em maiúscula
public class ProgramaDoSuperUsuario {
	
	// principal método para execução de um programa em Java "public static void main"
	public static void main(String[] args) {
		final var superUsuario = new SuperUsuario(login: "root", senha: "12345");
		
		// chamando os métodos de da classe SuperUsuario
		superUsuario.getLogin();
		superUsuario.getSenha();
		
		String root = superUsuario.nome;
	}
}