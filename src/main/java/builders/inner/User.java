package builders.inner;

import java.time.LocalDate;

/**
 * Przykład klasy z wbudowanym builderem, który jest jedynym sposobem na utworzenie obiektu User
 */
public class User {
    //wymagane
    private String login;
    private String password;
    //opcjonalne
    private LocalDate birthDate;

    private User(){
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

    public static Builder.LoginRequired builder(){
        Builder builder = new Builder();
        builder.userInstance = new User();
        return login -> {
            builder.userInstance.login = login;
            return password -> {
                builder.userInstance.password = password;
                return builder;
            };
        };
    }

    public static final class Builder{
        private User userInstance;

        @FunctionalInterface
        interface LoginRequired{
            PasswordRequired login(String login);
        }

        @FunctionalInterface
        interface PasswordRequired{
            Builder password(String password);
        }

        public Builder birthDate(LocalDate date){
            this.userInstance.birthDate = date;
            return this;
        }

        public User build(){
            return userInstance;
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
