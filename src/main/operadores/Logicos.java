package operadores;

public class Logicos {
  public static void main(String[] args) {
    final var numero = 2;
    final var letra = "A";

    //Sort Circuit: faz as condições apenas se forem verdadeiras, E(&&)/OU(||)
    if (numero < 5 && letra.equals("A")) { // entra na condução de numero for menor que 5 E letra igual a A
      System.out.println("Atendeu a condição");
    }

    if (numero < 5 || letra.equals("A")) { // entra na condução de numero for menor que 5 OU letra igual a A
      System.out.println("Atendeu a outracondição");
    }

    if ((10 - 5) > 1 && (5 - 3) > 1) { // operador lógico E
      System.out.println("Lógica maluca...");
    }

    //Non Sort Circuit: faz a condição se apenas um dos operadores for verdadeiro, E(&)/OU(|)
    if (verifica(15) | verifica("A")) {
        System.out.println("OK");
    } else {
        System.out.println("Não OK");
    }
  }

  private static boolean verifica(String letra) {
    System.out.println("Verificando letra...");
    return letra.equals("A");
  }

  private static boolean verifica(Integer numero) {
    System.out.println("verificando numero...");
    return numero > 10;
  }
}