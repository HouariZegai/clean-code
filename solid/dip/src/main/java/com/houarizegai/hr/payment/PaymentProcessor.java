package com.houarizegai.hr.payment;

import com.houarizegai.hr.notifications.EmailSender;
import com.houarizegai.hr.persistence.EmployeeFileRepository;
import com.houarizegai.hr.persistence.EmployeeFileSerializer;
import com.houarizegai.hr.personnel.Employee;

import java.util.List;

public class PaymentProcessor {

    private EmployeeFileRepository employeeRepository;

    public PaymentProcessor(){
        EmployeeFileSerializer serializer =
                new EmployeeFileSerializer();
        this.employeeRepository =
                new EmployeeFileRepository(serializer);
    }

    public int sendPayments(){
        List<Employee> employees = this.employeeRepository.findAll();
        int totalPayments = 0;

        for(Employee employee : employees){
            totalPayments += employee.getMonthlyIncome();
            EmailSender.notify(employee);
        }

        return totalPayments;
    }
}
