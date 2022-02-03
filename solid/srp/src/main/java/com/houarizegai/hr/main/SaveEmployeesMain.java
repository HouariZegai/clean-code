package com.houarizegai.hr.main;

import com.houarizegai.hr.persistence.EmployeeRepository;
import com.houarizegai.hr.personnel.Employee;

import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees){
            Employee.save(e);
        }
    }
}
