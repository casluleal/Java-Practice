package Classes.Employees;

import java.util.Calendar;

public class HourlyEmployee extends Employee {

    private int hoursWorked;

    public HourlyEmployee(String name, int age, double salary) {
        super(name, age, salary);
    }

    public void setHoursWorked(int hoursWorked) throws Exception {
        if (hoursWorked < 0) {
            throw new Exception("The hour must be a positive integer.");
        }

        this.hoursWorked = hoursWorked;
    }

    @Override
    public String paySalary() {
        double payment = this.getSalary() * this.hoursWorked;
        this.hoursWorked = 0;

        return String.format("Your salary this month is $%.2f.", payment);
    }
}
