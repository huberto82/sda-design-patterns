package builders.inneroptional;

import java.time.LocalDate;
import java.util.Optional;

/**
 * Klasa z builderem zwracającym Optional<User>, zabezpieczonym przed niepoprawnym użyciem budowniczego
 * gdy pobierze się referencję do samego buildere, jak poniżej np.
 * UserA.Builder builder = User.builder().login("asdad").password("sdfsfd");
 * Optional<User> userOne = builder.birthDate(LocalDate.now()).build();
 * Każde wywołanie build() powoduje zwrócenie zbudowanego obiektu z jednoczesnym zniszczeniem tego obiektu wewnątrz buildera,
 * co powoduje, że ponowna próba wykorzystania tego egzemplarza buildera zakończy się zwróceniem pustego Optionala np.:
 * Optional<User> userTwo = builder.birthDate(LocalDate.of(2000,10,10)).build();
 * Także przekazanie wartości null dla parametrów obowiązkowych nie twory obiekyu i zwraca pusty Optional
 */
public class User {
    //wymagane
    private String login;
    private String password;
    //opcjonalne
    private LocalDate birthDate;

    private User() {
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public static User.Builder.LoginRequired builder() {
        User.Builder builder = new User.Builder();
        builder.userInstance = Optional.of(new User());
        return login -> {
            builder.userInstance =
                    Optional.ofNullable(login)
                            .flatMap(field ->
                                    builder.userInstance.map(
                                            instance -> {
                                                instance.login = field;
                                                return Optional.ofNullable(instance);
                                            }))
                            .orElse(Optional.empty());
            return password -> {
                builder.userInstance =
                        Optional.ofNullable(password)
                                .flatMap(field ->
                                        builder.userInstance.map(
                                                instance -> {
                                                    instance.password = field;
                                                    return Optional.ofNullable(instance);
                                                }))
                                .orElse(Optional.empty());
                return builder;
            };
        };
    }

    public static final class Builder {
        private Optional<User> userInstance;

        @FunctionalInterface
        interface LoginRequired {
            PasswordRequired login(String login);
        }

        @FunctionalInterface
        interface PasswordRequired {
            Builder password(String password);
        }

        public Builder birthDate(LocalDate date) {
            this.userInstance.map(userInstance -> userInstance.birthDate = date);
            return this;
        }

        public Optional<User> build() {
            Optional<User> result = userInstance;
            userInstance = Optional.empty();
            return result;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
