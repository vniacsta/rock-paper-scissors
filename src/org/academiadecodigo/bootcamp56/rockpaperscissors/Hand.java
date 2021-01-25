package org.academiadecodigo.bootcamp56.rockpaperscissors;

public enum Hand {

    // creating 3 objects
    // possible hands during game
    ROCK,
    PAPER,
    SCISSORS;

    // method that will match the random number generated with the objects type Hand
    public static Hand getHand(int index) {

        // match the random numbers with the objects type Hand
        Hand hand = null;

        switch (index) {
            case 0:
                hand = Hand.ROCK;
                break;
            case 1:
                hand = Hand.PAPER;
                break;
            case 2:
                hand = Hand.SCISSORS;
                break;
        }

        return hand;
    }
}
