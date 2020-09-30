package strings;

public class StringBuilder {
  public static void main(String[] args) {
    var nome = "André";

    final var builder = new java.lang.StringBuilder(nome);
    System.out.println(builder.append("Luis")); // append, adiciona uma nova string, da variável string anterior, nome

    final var reverse = builder.reverse(); // reverse, faz uma nova string de trás pra frente

    System.out.println(reverse);
	
	// insert, insere caracteres em posições específicas da mensagem
    final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
    System.out.println(insert);
  }
}