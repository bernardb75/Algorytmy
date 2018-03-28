package Testowanie.UnitTestStageOne;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TriplesTest {
    int expected;
    String input;

    public TriplesTest(int expected, String input){
        this.expected=expected;
        this.input=input;
    }
    @Parameters
    public static Collection<Object[]>testInput(){
        return Arrays.asList(new Object[][]{
                {1,"abcXXXabc"},
                {3,"xxxabyyyycd"},
                {0,"a"}
        });
    }
    @Test
    public void triplesTest(){
        Calculator calculator=new Calculator();
        Assert.assertEquals(expected,calculator.triples(input));
    }
}
