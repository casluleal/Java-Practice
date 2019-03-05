package Tests;

import Classes.Employees.Executive;
import junit.framework.TestCase;

import java.util.Calendar;

public class ExecutiveTests extends TestCase {

    public void testMonthPayment() {
        Executive e = new Executive("John Doe", 56, 15000.00, Calendar.getInstance());
        assertEquals("Your salary this month is $15000.00.", e.paySalary());
    }
}
