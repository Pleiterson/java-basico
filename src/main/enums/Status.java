package one.digitalinnovation.enums;

public enum Status {
    OPEN(13, "Aberto"), // podem ter valores agregados
    CLOSE(02, "Fechado");

    private int cod;
    private String texto;

    Status(final int cod, final String texto) {
        this.cod = cod;
        this.texto = texto;
    }
	
	// recuperando o código do enum
    public int getCod() {
        return cod;
    }
	
	// recuperando o texto do enum
    public String getTexto() {
        return texto;
    }
}