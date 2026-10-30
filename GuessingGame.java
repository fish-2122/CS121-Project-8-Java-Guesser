import java.util.*;

public class GuessingGame {
    Scanner scanner = new Scanner(System.in);

    public GuessingGame() {
        System.out.println("Game initialized");
    }

    public void startGame() {
        boolean keepGoing = true;
        while (keepGoing) {
            printMenu();

            int input = -1;

            boolean validInput = false;
            while (!validInput) {
                try {
                    input = scanner.nextInt();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                    scanner.nextLine();
                }
            }
            
            if (input == 0) {
                keepGoing = false;
            } else if (input == 1) {
                playerGame();
            } else if (input == 2) {
                algorithmGame();
            } else {
                System.out.println("Invalid input.");
            }
        }
    }

    public void playerGame() {
        int randomNum; //                   max  min        min
        randomNum = (int)(Math.random() * ((100 - 0) + 1)) + 0;
        int guess = -1;
        int guesses = 0;

        System.out.println("Guess a number between 0 and 100: ");

        boolean keepGoing = true;
        while (keepGoing) {

            boolean validInput = false;
            while (!validInput) {
                try {
                    guess = scanner.nextInt();
                    guesses++;
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                    scanner.nextLine();
                }
            }

            if (guess == randomNum) {
                System.out.println("You win! You got it in " + guesses + " gueses!");
                keepGoing = false;
            } else if (guess < randomNum) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }
    }

    public void algorithmGame() {
        int algorithimGuess = 50;
        double algorithmDivide = 50.0;
        int algorithimGuesses = 1;

        System.out.println("Think of a number between 0 and 100");
        
        scanner.nextLine(); // used to clear input buffer so it doesn't do an unintended input
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("I guess " + algorithimGuess);
            printAlgorithmGameMenu();

            String input = scanner.nextLine();
            if (algorithimGuesses > 7) {
                System.out.println("You cheated!");
                keepGoing = false;
            } else if (input.toLowerCase().equals("h")) {
                algorithmDivide /= 2;
                algorithimGuess -= (int) Math.round(algorithmDivide);
                algorithimGuesses++;
            } else if (input.toLowerCase().equals("l")) {
                algorithmDivide /= 2;
                algorithimGuess += (int) Math.round(algorithmDivide);
                algorithimGuesses++;
            } else if (input.toLowerCase().equals("c")) {
                System.out.println("Yay! I got it in " + algorithimGuesses + " guesses!");
                keepGoing = false;
            } else {
                System.out.println("Invalid input!");
            }
        }
    }

    public void printMenu() {
        System.out.println("0) Quit");
        System.out.println("1) Human Guesser");
        System.out.println("2) Computer Guesser");
    }

    public void printAlgorithmGameMenu() {
        System.out.println("Too (H)igh, too (L)ow, or (C)orrect?");
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.startGame();
    }
}