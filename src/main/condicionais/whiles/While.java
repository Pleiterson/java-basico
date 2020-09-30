package whiles;

public class While {
  public static void main(String[] args) {
    var x = 0;

    //Testa a condição antes
    while (x < 1) { // faz a condição enquanto x é menor que 1
      System.out.println("Dentro do while...");
      x++; // incremento para a condição não entrar em loop. quando x for maior que 1 a condição encerra	  
    }

    var y = 0;

    //Testa a condição depois
    do { // faz a condição enquanto o while for verdadeiro
      System.out.println("Dentro do do/while...");
    } while (y++ < 1); // quando o incremento do y for maior que 1, a condição encerra
  }
}