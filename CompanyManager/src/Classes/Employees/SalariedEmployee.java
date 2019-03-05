package Classes.Employees;

import java.util.Calendar;

public class SalariedEmployee extends Employee {

    public SalariedEmployee(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public String paySalary() {
        return String.format("Your salary this month is $%.2f.", this.getSalary());
    }
}
