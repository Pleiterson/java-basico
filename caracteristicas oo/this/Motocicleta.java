package aulas.oo.part04.exemploThis;

public class Motocicleta extends Veiculo {
    private String cilindradas; // será usado no this.modelo

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
		// this.cilindradas refere-se ao cilindradas definido na classe Veiculo, "private String cilindradas"
        this.cilindradas = cilindradas; // cilindradas depois do = refere-se ao cilindradas do parâmetro
    }

    public double calculaImposto() {
        return this.getValorVenal() * 0.03;
    }
}