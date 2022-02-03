package com.houarizegai.hr.main;

import com.houarizegai.hr.logger.ConsoleLogger;
import com.houarizegai.hr.persistence.EmployeeFileSerializer;
import com.houarizegai.hr.persistence.EmployeeRepository;
import com.houarizegai.hr.personnel.Employee;

import java.io.IOException;
import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository(new EmployeeFileSerializer());
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees){
            try {
                repository.save(e);
                ConsoleLogger.info("Saved employee " + e);
            } catch (IOException ex) {
                ConsoleLogger.info("ERROR: Could not save employee. " + ex);
            }
        }
    }
}
