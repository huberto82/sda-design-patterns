package builders.outer;
import builders.inner.Person;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        Person person = Person
                .getBuilder().firstName("Janek")
                .lastName("Nowak")
                .login("jan")
                .phoneNumber("2837682374")
                .birthDate(LocalDate.of(2000,10,23))
                .build();
        System.out.println(person);

        builders.outer.Person user = PersonFluentBuilderFunctional.builder().firstName("adela").lastName("kowal").login("adelka").build();
        System.out.println(user);

    }
}
