package com.houarizegai.designpatterns.builder;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;

    public Person(String firstName, String lastName, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender isGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("Person {\n\tFirst Name: %s\n\tLast Name: %s\n\tAge: %d\n\tGender: %s\n}",
                this.firstName,
                this.lastName,
                this.age,
                this.gender);
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private Gender gender; // isMale

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder gender(Gender gender) { // Is Male
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this.firstName, this.lastName, this.age, this.gender);
        }
    }
}
