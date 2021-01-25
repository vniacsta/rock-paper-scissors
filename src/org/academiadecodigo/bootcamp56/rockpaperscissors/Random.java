package org.academiadecodigo.bootcamp56.rockpaperscissors;

public class Random {

    // creating a random number from 0-2
    // static method to be used in other classes
    public static int genNumber(int max) {
        // returns a Math.random from 0-2 and transforms the double value into an int
        return (int) (Math.random() * max);
    }
}
