package one.digitalinnovation.finals;

public class Gamer {
    public String keyboard() {
        return "Keyboard Gamer!";
    }
	
	// quem herdar, sobrescrever Gamer, não vai conseguir
    public final String mouse() {
        return "Mouse Gamer!";
    }
}