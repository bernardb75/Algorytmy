package Testowanie.UnitTestStageOne;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class EvenSpec {
    private boolean expected;
    private double a;

    public EvenSpec(boolean expected, double a) {
        this.expected = expected;
        this.a = a;
    }

    @Parameters
    public static Collection<Object[]> evenNumbers() {
        return Arrays.asList(new Object[][]{
                {true, 2.0},
                {false, 3.0},
                {false, 1.5}
        });
    }

    @Test
    public void evenTest() {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.even(a));
    }
}