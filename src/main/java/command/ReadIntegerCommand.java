package command;

import java.io.InputStream;
import java.util.Scanner;

public class ReadIntegerCommand implements Command {
    //receiver
    private InputStream input;
    private int value;

    public ReadIntegerCommand(InputStream input) {
        this.input = input;
    }

    @Override
    public void execute() {
        value = new Scanner(input).nextInt();
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ReadCommand{" +
                "input=" + input +
                ", value=" + value +
                '}';
    }
}
