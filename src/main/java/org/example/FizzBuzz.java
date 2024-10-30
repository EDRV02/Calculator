package org.example;

public class FizzBuzz {
    static String FB(int i) {
        String f = "Fizz";
        String b = "Buzz";
        String neither = String.valueOf(i);

            if (i % 3 == 0) {
                return f;
            } else if (i % 5 == 0) {
                return b;
            } else {
                return neither;
            }


    }
}
