package aulas.oo.part02.construtores.exemplo003;

public class ExemploInstanciaObjeto {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); // vai dar erro, pois o construtor espera que passe uma string por parâmetro

        System.out.println(pessoa.getNome());
    }
}