package org.example;

public class BlackJack {
    public static String play(int one, int two) {
        // check both nums are above 0
        if (one > 0 && two > 0) {
            if (Math.max(one,two) > 21) { // check if max is above 21
                // if yes return the min
                return ("Closest to 21 is " + Math.min(one, two));
            } else if(one == two){
                return ("Numbers are equally close to 21");
            }
            else {
                return ("Closest to 21 is " + Math.max(one, two));
            }
        } else {
            return ("Both numbers need to be above zero.");
        }
    }
}
