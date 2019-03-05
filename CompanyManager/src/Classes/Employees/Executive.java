package Classes.Employees;

import java.util.Calendar;

public class Executive extends Employee {

    public Executive(String name, int age, double salary, Calendar admissionDate) {
        super(name, age, salary, admissionDate);
    }

    @Override
    public String paySalary() {
        return String.format("Your salary this month is $%.2f.", this.getSalary());
    }
}
