package Testowanie.UnitTestStageOne;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorAdditionSpec {
    private double expected;
    private double a;
    private double b;

    public CalculatorAdditionSpec(double expexted, double a, double b) {
        this.expected = expexted;
        this.a = a;
        this.b = b;
    }

    @Parameters
    public static Collection<Double[]> addedNumbers() {
        return Arrays.asList(new Double[][]{
                {1.0, 0.0, 1.0},
                {4.0, 2.0, 2.0},
                {8.0, 2.0, 6.0}
        });
    }

    @Test
    public void additionTest(){
        Calculator calculator=new Calculator();
        assertEquals(expected,calculator.addition(a,b),0.001);
    }
}