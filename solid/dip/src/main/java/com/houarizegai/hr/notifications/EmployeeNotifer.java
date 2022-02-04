package com.houarizegai.hr.notifications;

import com.houarizegai.hr.personnel.Employee;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

public interface EmployeeNotifer {

    void notify(Employee employee);
}
