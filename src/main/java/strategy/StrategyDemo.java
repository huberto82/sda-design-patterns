package strategy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Bonus - interfejs z metodą obliczającą kwotę po zastosowaniu bonusa
 * BirthDateBonus, RegularBonus, ChristmasBonus, IdentityBonus - klasy implementujące interfejs Bonus
 */
public class StrategyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz cenę:");
        BigDecimal price = new BigDecimal(scanner.next());
        System.out.println("Wybierz z której promocji chcesz skorzystac: regular, christmas, birthday");
        String bonusType = scanner.next();
        Bonus bonus;
        switch(bonusType){
            case "regular":
                bonus = RegularBonus.INSTANCE;
            break;
            case "christmas":
                bonus = new ChristmasBonus();
                break;
            case "birthday":
                System.out.println("Wpisz datę urodzin (YYYY-MM-DD):");
                bonus = new BirthDateBonus(LocalDate.now(), LocalDate.parse(scanner.next()));
                break;
             default:
                bonus = new IdentityBonus();
        }
        System.out.println("Twoja cena po zastosowaniu bonusu to: " + bonus.apply(price));
    }
}
