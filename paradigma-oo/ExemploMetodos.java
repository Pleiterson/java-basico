package aulas.oo.part01.paradigma.exemplo001;

public class ExemploMetodos {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); // criando uma pessoa
		
		// chama o método "falarMeuProprioNome()" e printará o resultado na tela
        System.out.println(pessoa.falarMeuProprioNome());
		
		// chama o método "andar()" e printará o resultado na tela
        System.out.println(pessoa.andar());
    }
}