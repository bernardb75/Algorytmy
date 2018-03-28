package Testowanie.UnitTestStageOne;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorSubstractionSpec {
    private double expected;
    private double a;
    private double b;

    public CalculatorSubstractionSpec(double expected, double a, double b) {
        this.expected = expected;
        this.a = a;
        this.b = b;
    }

    @Parameters
    public static Collection<Double[]> addedNumbers() {
        return Arrays.asList(new Double[][]{
                {1.0, 1.0, 0.0},
                {2.0, 4.0, 2.0},
                {6.0, 8.0, 2.0}

        });
    }

    @Test
    public void subtractionTest() {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.subtraction(a, b), 0.001);
    }
}
