package one.digitalinnovation.abstracts;

// não possui conteúdo, pois não tem corpo. Não existe, é uma ideia de algo
public abstract class FormaGeometrica {
    public abstract String nome();
    public abstract Double area();
	
	// possui conteúdo/corpo
    public String desenha(int x , int y) {
        return "Desenhando nas coordenadas X="+x+" Y:"+y;
    }
}