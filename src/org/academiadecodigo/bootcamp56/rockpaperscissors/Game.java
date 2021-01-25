package org.academiadecodigo.bootcamp56.rockpaperscissors;

public class Game {

    // creating fields for Game class to store the players scores
    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;

    // starting the game with the game logic
    // parameter is defined in Main - max 3 turns per game
    public void start(int maxTurns, Player player1, Player player2) {

        // loop through the maxTurns to play the game
        for (int i = 0; i < maxTurns; i++) {

            // save the result of invoking the random generator into the players variables
            int randomChoicePlayer1 = player1.getRandomNum(Hand.values().length);
            int randomChoicePlayer2 = player2.getRandomNum(Hand.values().length);

            // get the random number to match the index of the Hand type values
            Hand handPlayer1 = Hand.getHand(randomChoicePlayer1);
            Hand handPlayer2 = Hand.getHand(randomChoicePlayer2);

            // invoke the gameRules method to compare the game rules with the players random
            // choices
            gameRules(handPlayer1, handPlayer2, player1, player2);
        }

        // invoke the method to display this round's winner
        displayWinner(player1, player2);
    }

    // add the game rules with the parameters
    private void gameRules(Hand handPlayer1, Hand handPlayer2, Player player1, Player player2) {

        // conditions to win the game
        if (handPlayer1 == handPlayer2) {
            System.out.println("It's a tie...");
        }

        if (handPlayer1 == Hand.ROCK) {
            switch (handPlayer2) {
                case PAPER:
                    scorePlayer2++;
                    System.out.println(player1.name + " goes for rock. " + player2.name +
                            " goes for paper and wins!");
                    break;
                case SCISSORS:
                    scorePlayer1++;
                    System.out.println(player1.name + " goes for rock. " + player2.name +
                            " goes for scissors and gets smashed!");
                    break;
            }
        }

        if (handPlayer1 == Hand.PAPER) {
            switch (handPlayer2) {
                case ROCK:
                    scorePlayer1++;
                    System.out.println(player1.name + " goes for paper. " +
                            player2.name + " goes for rock and gets wrapped!");
                    break;
                case SCISSORS:
                    scorePlayer2++;
                    System.out.println(player1.name + " goes for paper. " + player2.name
                            + " cuts paper with scissors!");
                    break;
            }
        }

        if (handPlayer1 == Hand.SCISSORS) {
            switch (handPlayer2) {
                case ROCK:
                    scorePlayer2++;
                    System.out.println(player1.name + " goes for scissors. " +
                            player2.name + " goes for rock and smashes the scissors!");
                    break;
                case PAPER:
                    scorePlayer1++;
                    System.out.println(player1.name + " goes for scissors. " + player2.name +
                            " goes for paper and loses!");
                    break;
            }
        }
    }

    // display the winner to the console
    private void displayWinner(Player player1, Player player2) {

        if (scorePlayer1 > scorePlayer2) {
            System.out.println('\n' + player1.name + " wins!");

        } else if (scorePlayer2 > scorePlayer1) {
            System.out.println('\n' + player2.name + " wins!");

        } else {
            System.out.println('\n' + "It's a tie! Try again Avengers!");
        }
    }
}
