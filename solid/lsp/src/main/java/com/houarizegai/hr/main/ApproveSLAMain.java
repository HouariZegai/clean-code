package com.houarizegai.hr.main;

import com.houarizegai.hr.personnel.*;

import java.util.Arrays;
import java.util.List;

public class ApproveSLAMain {
    public static void main(String[] args) {
        // Create dependencies
        // Define SLA
        int minTimeOffPercent = 98;
        int maxResolutionDays = 2;
        ServiceLicenseAgreement companySla = new ServiceLicenseAgreement(
                minTimeOffPercent,
                maxResolutionDays);

        // Subcontractors
        Subcontractor subcontractor1 = new Subcontractor("Rebekah Jackson", 3000);
        Subcontractor subcontractor2 = new Subcontractor("Houari ZEGAI", 3400);
        List<Subcontractor> subcontractors = Arrays.asList(subcontractor1, subcontractor2);

        for (Subcontractor e : subcontractors){
            e.approveSLA(companySla);
        }
    }
}
