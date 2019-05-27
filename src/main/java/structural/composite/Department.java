package structural.composite;

import java.util.ArrayList;
import java.util.List;

// This is "Composite"
public class Department implements SalaryRecipient{

    private List<SalaryRecipient> salaryRecipients = new ArrayList<SalaryRecipient>();

    public float countNetSalary(float taxCoefficient){
        float resSalary = 0;

        for (SalaryRecipient recipients : salaryRecipients){
            resSalary += recipients.countNetSalary(taxCoefficient);
        }

        return resSalary;
    }

    public void add(SalaryRecipient recipient){
        salaryRecipients.add(recipient);
    }
}
