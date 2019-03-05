package Tests;

import Classes.Employees.Manager;
import junit.framework.TestCase;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;

public class ManagerTests extends TestCase {

    public void testMonthPayment() {
        Manager m  = getManager();
        assertEquals("Your salary this month is $7500.00.", m.paySalary());
    }

    @NotNull
    private Manager getManager() {
        return new Manager("John Doe", 32, 7500.00);
    }
}
