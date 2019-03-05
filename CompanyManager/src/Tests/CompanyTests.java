package Tests;

import Classes.Company;
import Classes.Employees.Executive;
import Classes.Employees.HourlyEmployee;
import Classes.Employees.Manager;
import Classes.Employees.SalariedEmployee;
import junit.framework.TestCase;

public class CompanyTests extends TestCase {

    public void testHiringHourlyEmployee() {
        Company c = new Company();
        assertTrue(c.hireEmployee(new HourlyEmployee("John Doe", 25, 25.00)));
    }

    public void testHiringSalariedEmployee() {
        Company c = new Company();
        assertTrue(c.hireEmployee(
                new SalariedEmployee("John Doe", 25, 3000.00))
        );
    }

    public void testHiringManager() {
        Company c = new Company();
        assertTrue(c.hireEmployee(
                new Manager("John Doe", 37, 7500.00)
        ));
    }

    public void testHiringExecutive() {
        Company c = new Company();
        assertTrue(c.hireEmployee(
                new Executive("John Doe", 57, 15000.00)
        ));
    }

    public void testFiringEmployee() {
        Company c = new Company();
        c.hireEmployee(new SalariedEmployee("John Doe", 25, 3000.00));
        assertTrue(c.fireEmployee("John Doe"));
    }

    public void testFiringNonexistentEmployee() {
        Company c = new Company();
        assertFalse(c.fireEmployee("John Doe"));
    }

    public void testRaisingEmployee() {
        Company c = new Company();
        c.hireEmployee(new SalariedEmployee("John Doe", 25, 2500.00));
        assertTrue(c.raiseEmployee("John Doe", 3000.00));
    }

    public void testRaisingEmployeeWithLowerSalary() {
        Company c = new Company();
        c.hireEmployee(new SalariedEmployee("John Doe", 25, 2500.00));
        assertFalse(c.raiseEmployee("John Doe", 2000.00));
    }

    public void testRaisingNonexistentEmployee() {
        Company c = new Company();
        assertFalse(c.raiseEmployee("John Doe", 3000.00));
    }
}
