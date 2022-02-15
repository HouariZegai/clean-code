package com.houarizegai.designpatterns.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MementoTest {

    @Test
    public void testMementoPattern() {
        CareTaker careTaker = new CareTaker();

        Employee employee = new Employee("Houari", "Tiaret, Algeria", "+2130000000");

        careTaker.save(employee);
        System.out.println("Save: " + employee);

        employee.setAddress("Algiers, Algeria");

        careTaker.save(employee);
        System.out.println("Saved: " + employee);

        employee.setAddress("Adrar, Algeria"); // we don't save it

        careTaker.revert(employee);
        System.out.println("Reverted to save point: " + employee);

        careTaker.revert(employee);
        System.out.println("Reverted to original: " + employee);
    }
}