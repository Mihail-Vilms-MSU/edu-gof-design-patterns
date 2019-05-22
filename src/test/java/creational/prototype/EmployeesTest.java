package creational.prototype;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class EmployeesTest {
    @Test
    public void clone_ReturnsNewInstance() throws CloneNotSupportedException{
        Employees employees = new Employees();
        employees.loadData();

        Employees clonedEmployees = employees.clone();
        List<String> clonedList = clonedEmployees.getEmployeeList();
        clonedList.add("emp5");
        assertEquals(5, clonedList.size());
    }
}
