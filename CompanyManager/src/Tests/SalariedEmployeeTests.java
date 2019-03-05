package Tests;

import Classes.Employees.SalariedEmployee;
import junit.framework.TestCase;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;

public class SalariedEmployeeTests extends TestCase {

    public void testMonthPayment() {
        SalariedEmployee e = getSalariedEmployee();
        assertEquals("Your salary this month is $3000.00.", e.paySalary());
    }

    @NotNull
    private SalariedEmployee getSalariedEmployee() {
        return new SalariedEmployee("John Doe", 25, 3000.00);
    }
}
