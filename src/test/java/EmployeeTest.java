import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
private Employee employee;
    @BeforeEach
    void setUp() {
        employee = new Employee("johndoe123","johndoe@test.com",true);
    }

    @AfterEach
    void tearDown() {
        employee = null;
    }

    @Test
    void getUsername() {

        assertEquals("johndoe123", employee.getUsername());
    }

    @Test
    void getEmail() {
        assertEquals("johndoe@test.com", employee.getEmail());
    }

    @Test
    void isActive() {
        assertTrue(employee.isActive());
    }
}