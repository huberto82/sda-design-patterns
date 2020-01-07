package decorator;

public class Message extends AbstractMessage {
    private String message;
    public Message(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "Komunikat: " + message;
    }
}
