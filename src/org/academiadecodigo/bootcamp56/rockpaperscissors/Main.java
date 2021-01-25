package org.academiadecodigo.bootcamp56.rockpaperscissors;

public class Main {

    public static void main(String[] args) {

        // creating my 2 players with the field name
        Player player1 = new Player("Tony Stark");
        Player player2 = new Player("Captain America");

        // create new game
        Game game = new Game();

        // start the game with a maximum of 3 turns
        game.start(3, player1, player2);
    }
}
