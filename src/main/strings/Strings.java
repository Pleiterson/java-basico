package strings;

public class Strings {
  public static void main(String[] args) {
    var nome = "André";
    var sobreNome = "Gomes";
    final var nomeCompleto = nome + sobreNome; // usa-se + para concatenar as variáveis e printar tudo na tela

    System.out.println(nome);
    System.out.println("Nome do cliente : " + nome);
    System.out.println("Nome completo do cliente : " + nomeCompleto);
	
    var string = new String(" Minha String "); // instanciando uma string

    System.out.println("Char na posição : " + string.charAt(5)); // charAt, retorna o caractere na posição 5 da string acima
    System.out.println("Quantidade=" + string.length()); // length, retorna a quantidade de caracteres na string
    System.out.println("Sem Trim [" + string + "]"); // mantém os caracteres no centro afastados dos conchetes [ Minha  String ], normal
    System.out.println("Com Trim [" + string.trim() + "]"); // com trim, os caracteres no centro juntos aos conchetes [Minha  String]
    System.out.println("Lower " + string.toLowerCase());  // com toLowerCase, os caracteres em minúsculos "minha  mtring"
    System.out.println("Upper " + string.toUpperCase()); // com toUpperCase, os caracteres em maiúsculos "MINHA STRING"
    System.out.println("Contém M? " + string.contains("M")); // contains, verifica se tem o "M" na string, se sim, retorna true
    System.out.println("Contém X? " + string.contains("X")); // contains, verifica se tem o "X" na string, se não, retorna false
    System.out.println("Replace " + string.replace("n", "$")); // replace, podemos trocar os caracteres de uma string, no caso "n" pelo "$"
    System.out.println("Equals? " + string.equals(" Minha String ")); // equals, realiza uma comparação e retorno true ou false
    System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" minha sTrinG ")); // equalsIgnoreCase, mesma coisa que o equals, mas ignora se contém letra maiúscula ou minúscula
    System.out.println("Substring(1,6)=" + string.substring(1, 6)); // substring, pega um valor que come~ça na posição x e termina em y, 1 e 6
  }
}