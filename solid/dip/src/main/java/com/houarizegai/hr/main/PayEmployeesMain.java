package com.houarizegai.hr.main;

import com.houarizegai.hr.notifications.EmailSender;
import com.houarizegai.hr.notifications.EmployeeNotifer;
import com.houarizegai.hr.payment.PaymentProcessor;
import com.houarizegai.hr.persistence.EmployeeFileRepository;
import com.houarizegai.hr.persistence.EmployeeFileSerializer;
import com.houarizegai.hr.persistence.EmployeeRepository;

public class PayEmployeesMain {

    /*
    Will take a couple of seconds to execute due to the
    sending of mails.
     */

    public static void main(String[] args) {
        EmployeeFileSerializer serializer = new EmployeeFileSerializer();
        EmployeeRepository employeeRepository = new EmployeeFileRepository(serializer);
        EmployeeNotifer employeeNotifier = new EmailSender();

        PaymentProcessor paymentProcessor = new PaymentProcessor(employeeRepository, employeeNotifier);
        int totalPayments = paymentProcessor.sendPayments();
        System.out.println("Total payments " + totalPayments);
    }
}
