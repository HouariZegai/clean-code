package com.houarizegai.hr.payment;

import com.houarizegai.hr.notifications.EmployeeNotifer;
import com.houarizegai.hr.persistence.EmployeeRepository;
import com.houarizegai.hr.personnel.Employee;
import com.houarizegai.hr.personnel.FullTimeEmployee;
import com.houarizegai.hr.personnel.Intern;
import com.houarizegai.hr.personnel.PartTimeEmployee;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PaymentProcessorTest {

    private EmployeeRepository employeeRepositoryMock;
    private EmployeeNotifer employeeNotifierMock;

    @BeforeAll
    public void setup() {
        List<Employee> employees = Arrays.asList(
                new FullTimeEmployee("Anna Smith",1000),
                new PartTimeEmployee("John Doe",500),
                new Intern("Gabriel Ortega", 200, 10)
        );

        employeeRepositoryMock = Mockito.mock(EmployeeRepository.class);
        Mockito.when(employeeRepositoryMock.findAll()).thenReturn(employees);

        employeeNotifierMock = Mockito.mock(EmployeeNotifer.class);
    }

    @Test
    void send_payments_should_pay_all_employee_salaries(){
        PaymentProcessor paymentProcessor = new PaymentProcessor(employeeRepositoryMock, employeeNotifierMock);

        int result = paymentProcessor.sendPayments();
        assertEquals(1700, result);
    }
}