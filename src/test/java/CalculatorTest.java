import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    void setUp() {
         calc = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calc = null;
    }

    @Test
    void add() {

        double res = calc.add(3,5);
        Assertions.assertEquals(8.0,res);
    }
    @Test
    void testDiv(){

        int res = calc.div(6,3);
        Assertions.assertEquals(2,res);

        assertThrows(ArithmeticException.class,()->calc.div(10,0),"/zero should be thrown");




    }


    @Test
    void multiply() {
        double expectedResult = calc.multiply(5,4);
        Assertions.assertEquals(20,expectedResult);

    }

    @Test
    void subtract() {
        double exResult = calc.subtract(10,2);
        Assertions.assertEquals(8.0,exResult);
    }

    @ParameterizedTest
    @ValueSource(ints ={2,4,6,8,10})
    void isEven(int n) {

        assertTrue(calc.isEven(n));
    }

    @ParameterizedTest
    @ValueSource(strings ={""," ","    "})
    void isBlank(String input) {
        assertTrue(calc.isBlank(input));
    }
}