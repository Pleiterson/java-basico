package aulas.oo.part04.exemploThis;

public class Veiculo {
    private String modelo; // será usado no this.modelo
    private String marca; // será usado no this.marca

    private double valorVenal;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
		// this.modelo refere-se ao modelo definido na classe Veiculo, "private String modelo"
        this.modelo = modelo; // modelo depois do = refere-se ao modelo do parâmetro
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
		// this.marca refere-se ao marca definido na classe Veiculo, "private String marca"
        this.marca = marca; // marca depois do = refere-se ao marca do parâmetro
    }

    public void acelera() {
        System.out.println("Acelerando...");
    }

    public double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public double calculaImposto() {
        return this.valorVenal * 0.01;
    }
}