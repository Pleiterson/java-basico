package aulas.oo.part04.exemploThis;

public class Carro extends Veiculo {
    private int quantidadeDePortas; // será usado no this.modelo

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
		// this.quantidadeDePortas refere-se ao quantidadeDePortas definido na classe Veiculo, "private String quantidadeDePortas"
        this.quantidadeDePortas = quantidadeDePortas;  // quantidadeDePortas depois do = refere-se ao quantidadeDePortas do parâmetro
    }

    public double calculaImposto() {
        return this.getValorVenal() * 0.07;
    }
}