package structural.composite;

// This is "Leaf"
public class Employee implements SalaryRecipient {
    private float grossSalary;

    Employee(float grossSalary){
        this.grossSalary = grossSalary;
    }

    public float countNetSalary(float taxCoefficient) {
        return grossSalary*(1-taxCoefficient);
    }
}
