package com.houarizegai.hr.taxes;

import com.houarizegai.hr.personnel.Employee;

public class InternsTaxCalculator implements TaxCalculator {
    private final int RETIREMENT_TAX_PERCENTAGE = 16;

    @Override
    public double calculate(Employee employee) {
        final int income = employee.getMonthlyIncome();
        return income < 350 ? 0 : income * RETIREMENT_TAX_PERCENTAGE / 100;

    }
}
