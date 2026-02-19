package com.GLA.Strings.Level1;

import java.util.Scanner;

public class RockPaperScissorsGame {

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "draw";
        } else if ((player.equals("rock") && computer.equals("scissors")) ||
                (player.equals("paper") && computer.equals("rock")) ||
                (player.equals("scissors") && computer.equals("paper"))) {
            return "player";
        } else {
            return "computer";
        }
    }

    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];
        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.valueOf((playerWins * 100.0) / totalGames);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf((computerWins * 100.0) / totalGames);

        return stats;
    }

    public static void displayResults(int totalGames, int playerWins, int computerWins, int draws, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Total Games: " + totalGames);
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Draws: " + draws);

        System.out.println("\nStats Table:");
        System.out.println("Name\tWins\tWin %");
        System.out.println("---------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();
        sc.nextLine();

        int playerWins = 0, computerWins = 0, draws = 0;

        for (int i = 1; i <= totalGames; i++) {
            System.out.print("\nGame " + i + " - Enter your choice (rock/paper/scissors): ");
            String playerChoice = sc.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();

            System.out.println("Computer chose: " + computerChoice);

            String winner = findWinner(playerChoice, computerChoice);
            if (winner.equals("player")) {
                playerWins++;
                System.out.println("Result: Player wins!");
            } else if (winner.equals("computer")) {
                computerWins++;
                System.out.println("Result: Computer wins!");
            } else {
                draws++;
                System.out.println("Result: Draw!");
            }
        }

        String[][] stats = calculateStats(playerWins, computerWins, totalGames);
        displayResults(totalGames, playerWins, computerWins, draws, stats);

        sc.close();
    }
}