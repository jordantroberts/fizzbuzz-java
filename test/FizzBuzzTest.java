import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void test(){
        FizzBuzz test = new FizzBuzz();
        String result = test.isDivisibleBy(15);
        assertEquals("Fizzbuzz", result);
    }

    @Test
    public void test2(){
        FizzBuzz test = new FizzBuzz();
        String result2 = test.isDivisibleBy(5);
        assertEquals("Buzz", result2);
    }

    @Test
    public void test3(){
        FizzBuzz test = new FizzBuzz();
        String result3 = test.isDivisibleBy(3);
        assertEquals("Fizz", result3);
    }

}