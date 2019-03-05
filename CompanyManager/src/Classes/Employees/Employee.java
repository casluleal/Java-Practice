package Classes.Employees;

import java.util.Calendar;

public abstract class Employee extends Person {

    private double salary;
    private Calendar admissionDate;

    Employee(String name, int age, double salary, Calendar admissionDate) {
        super(name, age);

        this.salary = salary;
        this.admissionDate = admissionDate;
    }

    double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Calendar getAdmissionDate() {
        return this.admissionDate;
    }

    public abstract String paySalary();
}
