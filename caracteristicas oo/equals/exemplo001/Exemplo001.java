package aulas.oo.part04.exemploEquals.exemplo001;

public class Exemplo001 {
    public static void main(String[] args) {
        Veiculo carro1 = new Carro("Palio", "Fiat", 20000.0);
        Veiculo carro2 = new Carro("Palio", "Fiat", 20000.0);

        System.out.println(carro1.equals(carro2)); // equals vai comparar carro1 e carro2 e retornará false, visto que são objetos diferentes
    }
}