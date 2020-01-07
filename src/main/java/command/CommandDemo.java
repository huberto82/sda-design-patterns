package command;

import java.util.ArrayList;
import java.util.List;

/**
 * Command - interfejs poleceń
 * PrintCommand - klasa implementująca interfejs Command, która drukuje komunikat przekazany w konstruktorze
 * ReadIntegerCommand - klasa implementująca Command, która wczytuje z podanego strumienia liczbę całkowitą
 */
public class CommandDemo {
    public static void main(String[] args) {
        //lista poleceń
        List<Command> commands = new ArrayList<>();
        //do listy kolejno dodajemy polecenia
        commands.add(new PrintCommand(System.out, "Program liczący pole prostokąta."));
        commands.add(new PrintCommand(System.out, "Podaj długość pierwszego boku:"));
        ReadIntegerCommand sideA = new ReadIntegerCommand(System.in);
        commands.add(sideA);
        commands.add(new PrintCommand(System.out, "Podaj długość drugiego boku:"));
        ReadIntegerCommand sideB = new ReadIntegerCommand(System.in);
        commands.add(sideB);
        //wykonujemy kolejno polecenia z listy
        for(Command command: commands){
            command.execute();
        }
        //obliczamy pole na podstawie pobranych wartości
        int area = sideA.getValue() * sideB.getValue();
        //dodajemy polecenie wyświetlenia wyniku
        commands.add(new PrintCommand(System.out, "Pole prostokąta:" + area));

        System.out.println("Historia poleceń:");
        for(Command command: commands){
            System.out.println(command);
        }
    }
}
