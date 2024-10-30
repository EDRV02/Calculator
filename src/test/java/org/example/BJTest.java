package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BJTest {
    @Test // first is closer
    public void test1(){
        BlackJack bj = new BlackJack();
        String expected = "Closest to 21 is 13";
        String result = bj.play(13,10);
        assertEquals(expected, result);
    }
    @Test // second is closer
    public void test2(){
        BlackJack bj = new BlackJack();
        String expected = "Closest to 21 is 18";
        String result = bj.play(13,18);
        assertEquals(expected, result);
    }
    @Test // both numbers are equal
    public void test3(){
        BlackJack bj = new BlackJack();
        String expected = "Numbers are equally close to 21";
        String result = bj.play(13,13);
        assertEquals(expected, result);
    }
    @Test // one number is above 21
    public void test4(){
        BlackJack bj = new BlackJack();
        String expected = "Closest to 21 is 10";
        String result = bj.play(22,10);
        assertEquals(expected, result);
    }
    @Test // one number is below 0
    public void test5(){
        BlackJack bj = new BlackJack();
        String expected = "Both numbers need to be above zero.";
        String result = bj.play(-1,10);
        assertEquals(expected, result);
    }
}
