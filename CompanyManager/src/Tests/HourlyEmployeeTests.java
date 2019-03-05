package Tests;

import Classes.Employees.HourlyEmployee;
import junit.framework.TestCase;

import java.util.Calendar;

public class HourlyEmployeeTests extends TestCase {

    public void testMonthPayment() {
        HourlyEmployee e = getHourlyEmployee();
        try {
            e.setHoursWorked(120);
            assertEquals("Your salary this month is $3000.00.", e.paySalary());
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    public void testMonthPaymentWithNegativeHours() {
        HourlyEmployee e = getHourlyEmployee();
        try {
            e.setHoursWorked(-10);
        } catch (Exception ex) {
            assertEquals("The hour must be a positive integer.", ex.getMessage());
        }
    }

    private HourlyEmployee getHourlyEmployee() {
        return new HourlyEmployee("John Doe", 25, 25.0);
    }
}
