package builders.inner;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private String login;
    //pola opcjonale
    private String phoneNumber;
    private LocalDate birthDate;

    private Person(String firstName, String lastName, String login, String phoneNumber, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String login;
        //pola opcjonale
        private String phoneNumber;
        private LocalDate birthDate;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String firstName){
            this.lastName = lastName;
            return this;
        }

        public Builder login(String login){
            this.login = login;
            return this;
        }

        public Builder phoneNumber(String phone){
            this.phoneNumber = phone;
            return this;
        }

        public Builder birthDate(LocalDate date){
            this.birthDate = date;
            return this;
        }

        public Person build(){
            return new Person(firstName, lastName, login, phoneNumber, birthDate);
        }
    }

    @Override
    public String toString() {
        return "PersonWithInnerBuilder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
