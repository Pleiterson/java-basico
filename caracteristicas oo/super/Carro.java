package aulas.oo.part04.exemploSuper;

public class Carro extends Veiculo {
    public Carro(String modelo, String marca, double valorVenal) {
        super(modelo, marca, valorVenal); // vaiáveis referem-se a classe Veiculo, e não aos parâmetros
    }

    public Carro(String modelo, String marca, double valorVenal, int quantidadeDePortas) {
        super(modelo, marca, valorVenal); // vaiáveis referem-se a classe Veiculo, e não aos parâmetros
        this.quantidadeDePortas = quantidadeDePortas;
    }

    private int quantidadeDePortas;

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public double calculaImposto() {
        return this.getValorVenal() * 0.07;
    }
}