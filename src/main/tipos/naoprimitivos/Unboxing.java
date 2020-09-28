package one.digitalinnovation.tipos.naoprimitivos;

public class Unboxing {
    public static void main(String[] args) {
		// consegue instanciar um objeto ao tipo primitivo, mesmo tamanho e mesmas características
        int i = new Integer(3);
        int inteiro = Integer.valueOf(1024);

        //boolean b = new Boolean(true);
        boolean b2 = Boolean.TRUE;
        boolean b3 = Boolean.getBoolean("false");
    }
}