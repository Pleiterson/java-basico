package aulas.oo.part01.paradigma.exemplo001;

public class ExemploInstanciaObjeto {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); // criando uma pessoa
		
		// printará o que consta na variável nome da classe Pessoa
        System.out.println(pessoa.getNome());        
    }
}