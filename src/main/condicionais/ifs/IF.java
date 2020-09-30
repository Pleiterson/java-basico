package ifs;

public class IF {
  public static void main(String[] args) {
    final var condicao = false;
	
	//retornando true ou false
    if (condicao) {
      System.out.println("A condição é verdadeira");
    } else {
      System.out.println("A condição é falsa");
    }
	
	// se na condição houver apenas uma linha, não é necessário colocar chaves {}
    if (condicao)
      System.out.println("Uma única linha...");
  
	// if ternário, o sinal ? verifica a condição, faz o if
    final var ternario = condicao ? "é verdadeira" : "é falsa";
    System.out.println(ternario);
  }
}