package aulas.oo.part01.paradigma.exemplo001;

public class Pessoa { // classe Pessoa
    private String nome = "Marco"; // atributo, variável

    public String getNome() { // método
        return nome; // retorna apenas o que consta no atributo nome
    }

    public String falarMeuProprioNome(){ // método
        return "Olá, meu nome é " + getNome(); // retorna o texto e o que consta no atributo nome
    }

    public String andar() {
        return "Andando..."; // retorna o texto
    }
}