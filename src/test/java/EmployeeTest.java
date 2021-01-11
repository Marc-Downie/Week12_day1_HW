import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Marc", "DO00M", 25000.0);
    }



    @Test
    public void canGetName() {
        assertEquals("Marc", employee.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("DO00M", employee.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(25000.0, employee.getSalary(), 0.01);
    }

    @Test
    public void canSetName() {
        employee.setName("Thomas");
        assertEquals("Thomas", employee.getName());
    }

    @Test
    public void canSetSalary() {
        employee.setSalary(20000.0);
        assertEquals(20000.0, employee.getSalary(), 0.01);
    }

    @Test
    public void canSetNiNumber() {
        employee.setNiNumber("WO00ps");
        assertEquals("WO00ps", employee.getNiNumber());
    }

    @Test
    public void canRaiseSalary() {
        employee.raiseSalary(1000.0);
        assertEquals(26000.0, employee.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        employee.payBonus();
        assertEquals(250, employee.payBonus(), 0.01);
    }
    }

