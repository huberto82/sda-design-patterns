package builders.telescope;

import java.time.LocalDate;

/**
 * Anachroniczna budowa klasy z konstruktorami teleskopowymi
 */
public class PersonTelescope {
    //pola obowiązkowe
    private String firstName;
    private String lastName;
    private String login;
    //pola opcjonale
    private String phoneNumber;
    private LocalDate birthDate;

    public PersonTelescope(){
    }

    //konstruktory teleskopowe
    public PersonTelescope(String firstName){
        this.firstName = firstName;
    }

    public PersonTelescope(String firstName, String lastName){
        this(firstName);
        this.lastName = lastName;
    }

    public PersonTelescope(String firstName, String lastName, String login){
        this(firstName, lastName);
        this.login = login;
    }

    //i tak dalej


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
}
