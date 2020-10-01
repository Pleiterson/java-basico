package aulas.oo.part02.construtores.exemplo002;

public class ExemploInstanciaObjeto {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); // criando um objeto pessoa
	
		pessoa.setNome("Marco Paulo");
        System.out.println(pessoa.getNome());
    }
}