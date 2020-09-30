package strings;

public class StringFormat {
  public static void main(String[] args) {
    var nome = "André";
    var sobreNome = "Gomes";
	
    final var nomeCompleto = nome + sobreNome; // usa-se + para concatenar as variáveis e printar tudo na tela

    System.out.println(nome);
    System.out.println("Nome do cliente : " + nome);
    System.out.println("Nome completo do cliente : " + nomeCompleto);
	
	// onde constar "%s" o compilador vai substituir pelas variaveis a seguir, no caso nome e sobreNome
    final var mensagem = String.format("O cliente %s possui sobre nome %s ", nome, sobreNome);
    System.out.println(mensagem);
	
	// será mostrado na tela o resultado da variável flutuante, com 2 casas depois da vígula com "%.2f"
    System.out.println(String.format("Numero %.2f ", 1.2375d));
  }
}