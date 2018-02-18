package Testowanie.UnitTestStageOne;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void additionShouldReturnFour(){
        Calculator calculator=new Calculator();
        assertEquals(4.0,calculator.addition(3.0,1.0),0);
    }
    @Test
    public void dodawanieZera(){
        Calculator calculator=new Calculator();
        assertEquals(0,calculator.addition(0,0),0);
    }
    @Test
    public void dodawanieJeden(){
        Calculator calculator=new Calculator();
        assertEquals(1,calculator.addition(0,1),0);
    }
}
