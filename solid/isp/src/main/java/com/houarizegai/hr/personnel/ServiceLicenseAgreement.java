package com.houarizegai.hr.personnel;

public class ServiceLicenseAgreement {
    private int minUptimePercent;
    private int problemResolutionTimeDays;

    public ServiceLicenseAgreement(int minUptime, int problemResolutionTimeDays) {
        this.minUptimePercent = minUptime;
        this.problemResolutionTimeDays = problemResolutionTimeDays;
    }

    public int getMinUptimePercent() {
        return minUptimePercent;
    }

    public int getProblemResolutionTimeDays() {
        return problemResolutionTimeDays;
    }
}
