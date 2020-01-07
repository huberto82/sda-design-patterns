package builders.outer;
import java.time.LocalDate;

/**
 * Odpowiednik PersonFluentBuilder'a ale z interfejsami wewnętrznymi i implementacją funkcyjną
 */
public final class PersonFluentBuilderFunctional {
    //pola obowiązkowe
    private String firstName;
    private String lastName;
    private String login;
    //pola opcjonale
    private String phoneNumber;
    private LocalDate birthDate;

    //interfejsy do wymuszenia na kliencie podania parametrów obowiązkowych
    @FunctionalInterface
    interface FirstNameRequired{
        LastNameRequired firstName(String field);
    }

    @FunctionalInterface
    interface LastNameRequired {
        LoginRequired lastName(String field);
    }

    @FunctionalInterface
    interface LoginRequired{
        PersonFluentBuilderFunctional login(String field);
    }

    //klasa budowniczego nie musi implementować interfejsów parametrów wymaganych,
    //możemy zdefiniować lambdy jako obiekty implementujące te interfejsy
    //Od tej metody zaczynamy budowanie obiektu Person
    public static FirstNameRequired builder(){
        PersonFluentBuilderFunctional builder = new PersonFluentBuilderFunctional();
        return firstName -> {
            builder.firstName = firstName;
            return lastName ->{
                builder.lastName = lastName;
                return login -> {
                    builder.login = login;
                    return builder;
                };
            };
        };
    }

    public PersonFluentBuilderFunctional phoneNumber(String field){
        this.phoneNumber = field;
        return this;
    }

    public PersonFluentBuilderFunctional birthDate(LocalDate date){
        this.birthDate = date;
        return this;
    }

    public Person build(){
        return new Person(firstName, lastName, login, phoneNumber, birthDate);
    }
}
