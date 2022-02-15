package com.houarizegai.designpatterns.memento;

public class Employee {

    private String name;
    private String address;
    private String phone;

    public Employee() {
    }

    public Employee(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " | " + address;
    }

    public EmployeeMemento save() {
        return new EmployeeMemento(name, address);
    }

    public void revert(EmployeeMemento employee) {
        this.name = employee.name();
        this.address = employee.address();
    }
}
