package telran.introduction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculationsTest {
@Test
    void sumTest(){
    assertEquals(4, Calculations.sum(2,2));
}
@Test
    void multyplyTest(){
    assertEquals(20, Calculations.multiply(4, 5));
    } 
@Test
    void divideTest(){
        assertEquals(8,Calculations.divide(72,9));
    }
@Test
    void subtractTest(){
        assertEquals(15,Calculations.subtract(20,5));
    }
@Test
    void sumOfDigitsTest(){
        assertEquals(15,Calculations.sumOfDigits(12345));
    }
@Test
    void maxDigitTest(){
        assertEquals(5,Calculations.maxDigit(12345));
    }
@Test
    void isDividedOnTest(){
        assertEquals(true, Calculations.isDividedOn(24,4));
    }
}

