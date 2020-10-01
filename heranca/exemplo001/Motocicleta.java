package aulas.oo.part03.heranca.exemplo001;

// Motocicleta herda (extends) os dados de Veiculo
public class Motocicleta extends Veiculo {
    private String cilindradas;

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }
}