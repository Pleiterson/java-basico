package operadores;

public class Igualdade {
  public static void main(String[] args) {
    final var numero = 11;

	// para verificar a igualdade, usa-se == (igual igual)
    if (numero == 10) {
      System.out.println("O número é 10");
    } else {
      System.out.println("O número  não é 10");
    }
	
	// para verificar a diferença, usa-se != (exclamação igual)
    if (numero != 10) {
      System.out.println("O número não é 10");
    } else {
      System.out.println("O número é 10");
    }

    final var letra = "B";
    if ("A".equals(letra)) { // equals, verifica se A é igual a B
      System.out.println("É a letra A");
    }

    if (!letra.equals("A")) { // exclamação a direita é a negação, else. Neha qualquer tipo de igualdade
      System.out.println("Não é a letra A");
    }
  }
}