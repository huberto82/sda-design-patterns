package builders.inneroptional;

import java.time.LocalDate;
import java.util.Optional;

public class UserDemo {
    public static void main(String[] args) {
        Optional<User> userOptional = User.builder().login("kazik").password("1245").birthDate(LocalDate.of(2000,10,10)).build();
        userOptional.ifPresent(System.out::println);
        userOptional = User.builder().login(null).password("124").birthDate(LocalDate.of(1990,4, 23)).build();
        userOptional.ifPresent(System.out::println);
    }
}
