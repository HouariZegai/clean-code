package com.houarizegai.hr.payment;

import com.houarizegai.hr.notifications.EmployeeNotifer;
import com.houarizegai.hr.persistence.EmployeeRepository;
import com.houarizegai.hr.personnel.Employee;

import java.util.List;

public class PaymentProcessor {

    private EmployeeRepository employeeRepository;
    private EmployeeNotifer employeeNotifier;

    public PaymentProcessor(EmployeeRepository employeeRepository, EmployeeNotifer employeeNotifer){
        this.employeeRepository = employeeRepository;
        this.employeeNotifier = employeeNotifer;
    }

    public int sendPayments(){
        List<Employee> employees = this.employeeRepository.findAll();
        int totalPayments = 0;

        for(Employee employee : employees){
            totalPayments += employee.getMonthlyIncome();
            employeeNotifier.notify(employee);
        }

        return totalPayments;
    }
}
