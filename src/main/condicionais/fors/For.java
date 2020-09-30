package fors;

public class For {
  public static void main(String[] args) {
	
	/* estrutura
	for(condição incial ; condição a ser avaliada ; o que realizará a cada interação dentro do for) {
		interação a ser realizada
	}
	*/
	
	// para i = 0, até 10 faça i=i+1
    for (int i = 0; i <= 10; i = i + 1) { // int declara uma variável
      System.out.println("I=" + i);
    }

    for (int x = 0; x <= 5; x++)
      System.out.println("X=" + x);    
  }
}