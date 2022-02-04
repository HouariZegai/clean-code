package com.houarizegai.hr.personnel;

public class Subcontractor {

    private String name;
    private int monthlyIncome;

    public Subcontractor(String name, int monthlyIncome) {
        setMonthlyIncome(monthlyIncome);

        this.name = name;
    }

    public boolean approveSLA(ServiceLicenseAgreement sla) {
        /*
        Business logic for approving a
        service license agreement for a
        for a subcontractor
         */
        boolean result = false;
        if (sla.getMinUptimePercent() >= 98
                && sla.getProblemResolutionTimeDays() <= 2) {
            result=  true;
        }

        System.out.println("SLA approval for " + this.getName() + ": " + result);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
}
