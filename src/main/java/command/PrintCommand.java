package command;

import java.io.PrintStream;

/**
 * Klasa drukuje komunikat do podanego strumienia
 */
public class PrintCommand implements Command {
    //receiver
    private PrintStream out;
    private String message;

    public PrintCommand(PrintStream out, String message) {
        this.out = out;
        this.message = message;
    }

    @Override
    public void execute() {
        out.println(message);
    }

    @Override
    public String toString() {
        return "PrintCommand{" +
                "out=" + out +
                ", message='" + message + '\'' +
                '}';
    }
}
