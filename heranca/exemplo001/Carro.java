package aulas.oo.part03.heranca.exemplo001;

// Carro herda (extends) os dados de Veiculo
public class Carro extends Veiculo {
    private int quantidadeDePortas;

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }
}