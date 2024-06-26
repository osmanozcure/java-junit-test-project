package test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import method.Factorial;
import org.junit.jupiter.api.Test;


public class FactorialTest {
    @Test
    public void testFindFactorial() {
        assertEquals(120, Factorial.findFactorial(5));
        assertEquals(24, Factorial.findFactorial(4));
        assertEquals(6, Factorial.findFactorial(3));
        assertEquals(2, Factorial.findFactorial(2));
        assertEquals(1, Factorial.findFactorial(1));
    }

}
