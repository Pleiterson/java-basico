package one.digitalinnovation.tipos.tipagem;

public class TipagemForte {
    public static void main(String[] args) {
        String texto = "meu texto"; // não será possível mais alterar o valor
        //texto = 1000; // integer em um tipo string. Aprensentará ERRO ao compilar
        Integer numero = Integer.valueOf("1024");
        numero = 512; //OK
    }
}