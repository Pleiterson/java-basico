// classes com nomes compostos, sempre a primeira letra em maiúscula
public class SuperUsuario {
	
	// atributos da classe SuperUsuario
	private String login;
	private String senha;
	String nome;
	
	/* construtor da classe SuperUsuario, os contrutores tem que ter o mesmo nome da classe
	 os contrutores estão recebendo o login e senha por parâmetro */
	public SuperUsuario(final String login, final String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	// métodos da classe onde contém um retorno (return), os parâmetros e assianturas são passados dentro dos parênteses
	public String getLogin() {return login;}
	protected String getSenha(){return senha;}
}