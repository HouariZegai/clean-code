package com.houarizegai.hr.main;

import com.houarizegai.hr.personnel.ServiceLicenseAgreement;
import com.houarizegai.hr.personnel.Subcontractor;

import java.util.Arrays;
import java.util.List;

public class ApproveSLAMain {
    public static void main(String[] args) {
        // Define SLA
        int minTimeOffPercent = 98;
        int maxResolutionDays = 2;
        ServiceLicenseAgreement companySla = new ServiceLicenseAgreement(
                minTimeOffPercent,
                maxResolutionDays);

        // Get collaborators from their own source
        Subcontractor subcontractor1 = new Subcontractor(
                "Rebekah Jackson",
                "rebekah-jackson@abc.com",
                3000,
                15);
        Subcontractor subcontractor2 = new Subcontractor(
                "Harry Fitz",
                "harryfitz@def.com",
                3000, 15);
        List<Subcontractor> collaborators = Arrays.asList(subcontractor1, subcontractor2);

        // Check SLA
        for (Subcontractor s : collaborators) {
            s.approveSLA(companySla);
        }
    }
}
