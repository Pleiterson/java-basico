package operadores;

public class Incremento {
  public static void main(String[] args) {
    var numero = 1;

    System.out.println(++numero); // incrementando, somando 1 na variável numero. Ou numero = numero + 1
	
    var variavel = 10;

    System.out.println(variavel--); // decrementando, diminuindo 1 na variável variavel. Ou variavel = variavel - 1
    System.out.println(variavel);
	
	/* "++numero" ++ a esquerda, primeiro incrementa, depois avalio a expressão
	   "numero++" ++ a direita, primeiro avalia a expressão, depois incrementa 
	   pode utilizar ++, incrementar ou -- decrementar */
  }
}