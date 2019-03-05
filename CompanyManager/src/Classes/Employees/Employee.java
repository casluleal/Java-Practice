package Classes.Employees;

import java.util.Calendar;

public abstract class Employee extends Person {

    private double salary;
    private Calendar admissionDate;

    Employee(String name, int age, double salary) {
        super(name, age);

        this.salary = salary;
        this.admissionDate = Calendar.getInstance();
    }

    public double getSalary() {
        return salary;
    }

    public boolean setSalary(double salary) {
        if (this.salary >= salary) {
            return false;
        }

        this.salary = salary;
        return true;
    }

    public Calendar getAdmissionDate() {
        return this.admissionDate;
    }

    public abstract String paySalary();
}
