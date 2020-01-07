package builders.outer;

import java.time.LocalDate;

/**
 * Przykładowa klasa
 */
public class Person {
    private String firstName;
    private String lastName;
    private String login;
    //pola opcjonale
    private String phoneNumber;
    private LocalDate birthDate;

    public Person(String firstName, String lastName, String login, String phoneNumber, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
