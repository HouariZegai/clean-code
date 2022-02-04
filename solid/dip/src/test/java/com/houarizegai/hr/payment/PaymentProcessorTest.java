package com.houarizegai.hr.payment;

import com.houarizegai.hr.payment.PaymentProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentProcessorTest {

    @Test
    public void send_payments_should_pay_all_employee_salaries(){
         // arrange
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // act
        int result = paymentProcessor.sendPayments();

        // assert
        assertEquals(5440, result);
    }
}