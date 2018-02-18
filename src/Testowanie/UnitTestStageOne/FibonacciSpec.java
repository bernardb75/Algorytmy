package Testowanie.UnitTestStageOne;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciSpec {
    int expected;
    private int a;

    public FibonacciSpec(int expected,int a){
        this.expected=expected;
        this.a = a;
    }
    @Parameters
    public static Collection<Integer[]> fibonacciNumbers() {
        return Arrays.asList(new Integer[][]{
                {0,0},
                {1,1},
                {1,2},
                {2,3},{3,4},{5,5},{8,6},{13,7}

        });
    }
    @Test
    public void fibonacciTest() {
        Calculator calculator=new Calculator();
        assertEquals(expected,calculator.fibonacci(a));
    }
}
