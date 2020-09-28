package one.digitalinnovation.tipos.primitivos;

public class DefaultValues {
    public static void main(String[] args) {
        final Default d = new Default(); // criando uma instância default

        System.out.println(d.getI()); // vai printar na tela zero (valor default), pois não há nenhum valor em i
        System.out.println(d.isActive()); // vai printar na tela false (valor default), pois não há nenhum valor em active
    }
}

class Default {  
    int i;
    boolean active;

    public int getI() {
		// retornará um atributo i que é um int
        return i;
    }

    public boolean isActive() {
		// retornará um atributo active que é um boolean
        return active;
    }
}