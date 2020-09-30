package operadores;

public class Matematicos {
  public static void main(String[] args) {
    System.out.println(0 + 1); // adição -> 1
    System.out.println(3 - 1); // subtração -> 2
    System.out.println(3 * 1); // multiplicação -> 3
    System.out.println(8 / 2); // divisão -> 4
    System.out.println(8 % 2); // módulo, resto de uma divisão -> 0

    var numero = 10;
    numero *= 2; // *= realiza (resumida) a multiplicação de 10*2 e já atribui o valor (resultado) na variável numero
    System.out.println(numero); // printando na tela a variável numero
  }
}