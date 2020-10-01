package aulas.oo.part03.heranca.exemplo001;

public class Exemplo001 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Nissan");
        carro.setModelo("March");
        carro.setQuantidadeDePortas(4);
		//carro.setCilindradas(150); // vai informar que não existe este método, pois ele pertence a Motocicleta e não Carro

        Motocicleta moto = new Motocicleta();
        moto.setMarca("DUCATI");
        moto.setModelo("STREETFIGHTER");
        moto.setCilindradas("850");
    }
}