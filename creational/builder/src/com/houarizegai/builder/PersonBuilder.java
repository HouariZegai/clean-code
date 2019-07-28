package com.houarizegai.builder;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private boolean gender; // isMale

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setGender(Gender gender) { // Is Male
        if(gender.equals(Gender.MALE))
            this.gender = true;
        else {
            this.gender = false;
        }

        return this;
    }

    public Person getPerson() {
        return new Person(this.firstName, this.lastName, this.age, this.gender);
    }
}
