package application;

public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate,
                            double annualSalary) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary(){
        return  annualSalary;
    }

    public void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }

    public boolean isRetired(){
        return isRetired;
    }

    public void retire(){
        this.isRetired = true;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", " + super.toString();
    }
}
