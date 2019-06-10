import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void test(){
        FizzBuzz test = new FizzBuzz();
        String result = test.isDivisibleBy(15);
        assertEquals("Fizzbuzz", result);
    }


}