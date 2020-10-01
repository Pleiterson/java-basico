package aulas.oo.part02.construtores.exemplo001;

public class ExemploInstanciaObjeto {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); // criando um objeto pessoa
		
		pessoa.setNome("Marco");
        System.out.println(pessoa.getNome());
    }
}