package structural.composite;

// This is "Leaf"
public class Contractor implements SalaryRecipient {
    private float grossSalary;

    Contractor(float grossSalary){
        this.grossSalary = grossSalary;
    }

    public float countNetSalary(float taxCoefficient) {
        return grossSalary*(1 - taxCoefficient - (float)0.1);
    }
}
