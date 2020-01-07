package command;

import java.util.ArrayList;
import java.util.List;

public class CommandTask {
    public static void main(String[] args) {
        List<Command> commands = new ArrayList<>();
        commands.add(new PrintCommand(System.out, "Program liczący pole prostokąta."));
        commands.add(new PrintCommand(System.out, "Podaj długość pierwszego boku:"));
        ReadIntegerCommand sideA = new ReadIntegerCommand(System.in);
        commands.add(sideA);
        commands.add(new PrintCommand(System.out, "Podaj długość drugiego boku:"));
        ReadIntegerCommand sideB = new ReadIntegerCommand(System.in);
        commands.add(sideB);
        /**
         * Zadanie
         * Dodaj dwa nowe polecenia, czy zdefiniuj dwie klasy implementujące interfejs Command
         * 1. Polecenie, które obliczy pole prostokąta (klasa RectanlgeAreaCommand) na podsatwie przekazanych
         *    dwóch poleceń ReadIntegerCommand
         * 2. Polecenie drukujące (klasa PrintAreaCommand - podobna do PrintCommand) obliczone pole w obiekcie poprzedniego polecenia        *    (czyli klasy RectangleAreaCommand).
         * Po zdefiniowaniu obu klas usuń komentarze w wierszaj poniżej i uruchom program
         */
        //RectangleAreaCommand area = new RectangleAreaCommand(sideA, sideB);
        //commands.add(area);
        //commands.add(new PrintAreaCommand(System.out, area));
        for(Command command: commands){
            command.execute();
        }

        System.out.println("Historia poleceń:");
        for(Command command: commands){
            System.out.println(command);
        }
    }
}
