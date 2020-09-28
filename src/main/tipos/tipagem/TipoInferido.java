package one.digitalinnovation.tipos.tipagem;

public class TipoInferido {
	// tipo inferido consegue atribuir tipo a ela sem informar o tipo, apenas var
    public static void main(String[] args) {
        var numero = Integer.valueOf("123456");
        var texto = "O Numero é : " ;

        System.out.println(texto + numero);
    }
}