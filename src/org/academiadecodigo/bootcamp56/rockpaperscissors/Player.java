package org.academiadecodigo.bootcamp56.rockpaperscissors;

public class Player {

    // creating variable to store the player's name
    // final means it cannot be changed, so there is no problem in being public
    public final String name;

    // declaring the constructor with the field name
    public Player(String name) {
        this.name = name;
    }

    // method will return a random number to each Player object
    public int getRandomNum(int max) {
        return Random.genNumber(max);
    }
}
