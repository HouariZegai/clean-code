package com.houarizegai.builder;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean gender; // isMale

    public Person() {

    }

    public Person(String firstName, String lastName, int age, boolean gender) {
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("Person {\n\tFirst Name: %s\n\tLast Name: %s\n\tAge: %d\n\tGender: %s\n}",
                this.firstName,
                this.lastName,
                this.age,
                this.gender? "Male" : "Female");
    }
}
