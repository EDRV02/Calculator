package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {

    @Test // mod of 3
    public void testFB1(){
        FizzBuzz fb = new FizzBuzz();
        String mod3 = fb.FB(3);
        String expected = "Fizz";
        assertEquals(expected, mod3);


    }
    @Test // mod of 5
    public void testFB2(){
        FizzBuzz fb = new FizzBuzz();
        String mod5 = fb.FB(5);
        String expected = "Buzz";
        assertEquals(expected, mod5);

    }
    @Test // mod of neither
    public void testFB3(){
        FizzBuzz fb = new FizzBuzz();
        String neither = fb.FB(7);
        String expected = "7";
        assertEquals(expected, neither);

    }
}
