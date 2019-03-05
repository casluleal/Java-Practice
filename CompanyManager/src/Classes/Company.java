package Classes;

import Classes.Employees.Employee;

import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public boolean hireEmployee(Employee e) {
        return employees.add(e);
    }

    public boolean fireEmployee(String employeeName) {
        for (Employee e : employees) {
            if (e.getName().equals(employeeName)) {
                return employees.remove(e);
            }
        }

        return false;
    }

    public boolean raiseEmployee(String employeeName, double newSalary) {
        Employee employee = null;

        for (Employee e : this.employees) {
            if (e.getName().equals(employeeName))
                employee = e;
        }

        if (employee == null) {
            return false;
        }

        return employee.setSalary(newSalary);
    }
}
