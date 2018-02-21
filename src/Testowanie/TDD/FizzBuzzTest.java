import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }
    @Test
    public void oneReturnsOne() {
        assertEquals("1", fizzBuzz.evaluate(1));
    }

    @Test
    public void twoReturnsTwo() {
        assertEquals("2", fizzBuzz.evaluate(2));
    }

    @Test
    public void treeReturnsTree() {
        assertEquals("Fizz", fizzBuzz.evaluate(3));
    }

    @Test
    public void fiveRetursFive() {
        assertEquals("Buzz", fizzBuzz.evaluate(5));
    }

    @Test
    public void sixReturnsSix() {
        assertEquals("Fizz", fizzBuzz.evaluate(6));
    }

    @Test
    public void tenReturnsTen() {
        assertEquals("Buzz", fizzBuzz.evaluate(10));
    }

    @Test
    public void fifteenReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.evaluate(15));
    }

    @Test
    public void thirtyReturnsThirty() {
        assertEquals("FizzBuzz", fizzBuzz.evaluate(30));
    }
}
