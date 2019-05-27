package structural.composite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepartmentTest {
    @Test
    public void count_4Employees_return100() {
        SalaryRecipient hrEmp = new Employee(30);
        SalaryRecipient itEmp = new Employee(30);

        SalaryRecipient hrContr = new Contractor(20);
        SalaryRecipient itContr = new Contractor(20);

        Department itDept = new Department();
        itDept.add(itEmp);
        itDept.add(itContr);

        Department allStaff = new Department();
        allStaff.add(itDept);
        allStaff.add(hrContr);
        allStaff.add(hrEmp);

        assertEquals(83, allStaff.countNetSalary((float)0.13), 0.1);

    }
}
