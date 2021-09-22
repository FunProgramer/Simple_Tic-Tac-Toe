package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create empty field
        char[][] field = new char[3][3];
        for (char[] chars : field) {
            Arrays.fill(chars, ' ');
        }

        // Print field
        printField(field);

        // Ask the user for coordinates for his move and check the input
        boolean gameFinished = false;
        char currentPlayer = 'X';
        while (!gameFinished) {
            int y, x;
            System.out.print("Enter the coordinates: ");
            try {
                y = sc.nextInt();
                x = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("You should enter numbers!");
                continue;
            }

            if (y < 1 || y > 3 || x < 1 || x > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }

            if (field[y-1][x-1] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }

            // Do the users move and print the resulting field
            field[y-1][x-1] = currentPlayer;
            printField(field);

            if (currentPlayer == 'X') {
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }

            gameFinished = analyzeGame(field);
        }

    }

    private static void printField(char[][] field) {
        System.out.println("---------");
        for (int y = 0; y < 3; y++) {
            System.out.print("| ");
            for (int x = 0; x < 3; x++) {
                System.out.print(field[y][x] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    /*
    * Analyzes the field, prints the result and returns true if the game is finished.
    * @returns true if game is finished otherwise false
    */
    private static boolean analyzeGame(char[][] field) {
        // Analyze game state
        boolean containsEmptyFields = false;
        int xCount = 0, oCount = 0;
        ArrayList<Character> winners = new ArrayList<>();
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field[y].length; x++) {
                char cell = field[y][x];
                if (cell == 'X') {
                    xCount++;
                }
                if (cell == 'O') {
                    oCount++;
                }
                if (cell != ' ') {
                    // Check if cell wins horizontal
                    if (Arrays.equals(field[y], new char[]{cell, cell, cell})) {
                        winners.add(cell);
                    }
                    // Case 1. row
                    else if (y == 0) {
                        // Check if cell wins vertical
                        if (field[y + 1][x] == cell) {
                            if (field[y + 2][x] == cell) {
                                winners.add(cell);
                            }
                        }
                        // Check if cell wins diagonal starting from top, left corner
                        else if (x == 0) {
                            if (field[y + 1][x + 1] == cell) {
                                if (field[y + 2][x + 2] == cell) {
                                    winners.add(cell);
                                }
                            }
                        }
                        // Check if cell wins diagonal starting from top, right corner
                        else if (x == 2) {
                            if (field[y + 1][x - 1] == cell) {
                                if (field[y + 2][x - 2] == cell) {
                                    winners.add(cell);
                                }
                            }
                        }
                    }
                } else {
                    containsEmptyFields = true;
                }
            }
        }

        // Finish analyzing and print game state result
        boolean isFinished = false;
        if (winners.equals(new ArrayList<Character>())) {
            if (!(xCount - oCount >= 2 || oCount - xCount >= 2) && !(containsEmptyFields)) {
                System.out.println("Draw");
                isFinished = true;
            }
        } else {
            if (!(winners.contains('X') && winners.contains('O'))) {
                System.out.println(winners.get(0) + " wins");
                isFinished = true;
            }
        }
        return isFinished;
    }
}
