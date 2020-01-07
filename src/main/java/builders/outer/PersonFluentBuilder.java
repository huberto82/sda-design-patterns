package builders.outer;

import java.time.LocalDate;

/**
 * Cechy zewnętrznego buildera
 * 1. Klasa  budowanego obiektu musi posiadać publiczny konstruktor z wszystkimi parametrami lub setery do wszystkim pól
 * 2. Budowniczy wymusza ustawienia obowiązkowych parametrów (choć nie zabepiecza przed wartościami null).
 */
public class PersonFluentBuilder implements FirstNameRequired, LastNameRequired, LoginRequired {
    //pola obowiązkowe
    private String firstName;
    private String lastName;
    private String login;
    //pola opcjonale
    private String phoneNumber;
    private LocalDate birthDate;

    public static FirstNameRequired build(){
        return new PersonFluentBuilder();
    }

    @Override
    public LastNameRequired firstName(String firstName) {
        this. firstName = firstName;
        return this;
    }

    @Override
    public LoginRequired lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public PersonFluentBuilder login(String field) {
        this.login = login;
        return this;
    }

    public PersonFluentBuilder phoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PersonFluentBuilder birthDate(LocalDate birthDate){
        this.birthDate = birthDate;
        return this;
    }
}
