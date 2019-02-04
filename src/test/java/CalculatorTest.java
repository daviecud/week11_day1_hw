import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator (72,36);

    }

    @Test
    public void testAdd(){
        assertEquals(108, calculator.getAddition());
    }

    @Test
    public void testDivision(){
        assertEquals(2, calculator.getDivision());
    }

    @Test
    public void testMultiply(){
        assertEquals(2592, calculator.getMultiply());
    }

    @Test
    public void testSubtraction(){
        assertEquals(36, calculator.getSubtract());
    }
}


