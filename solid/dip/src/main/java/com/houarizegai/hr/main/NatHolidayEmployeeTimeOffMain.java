package com.houarizegai.hr.main;

import com.houarizegai.hr.logging.ConsoleLogger;
import com.houarizegai.hr.persistence.EmployeeFileSerializer;
import com.houarizegai.hr.persistence.EmployeeFileRepository;
import com.houarizegai.hr.personnel.Employee;
import com.houarizegai.hr.personnel.FullTimeEmployee;

import java.util.List;

public class NatHolidayEmployeeTimeOffMain {
    public static void main(String[] args) {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeFileRepository repository = new EmployeeFileRepository(employeeFileSerializer);

        // Grab employees
        List<Employee> employees = repository.findAll();
        Employee manager = new FullTimeEmployee("Steve Jackson", 5000);

        // Request time off for each employee on
        // national holiday
        for (Employee employee : employees){
            employee.requestTimeOff(1, manager);
        }
    }
}
