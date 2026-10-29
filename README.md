# CS121-Project-8-Java-Guesser
### This is the number guesser except in java. Also the computer will use an algorithm to solve it automatically.

## GussingGame
```
import java util

public class GuessingGame {
    Scanner input

    public GuessingGame() {
        initialize input
    }

    public startGame() {
        keepGoing = true
        while keepGoing
            printMenu()
            input = scanner nextline
            if input = 0
                keepGoing = false
            if input = 1
                playerGame()
            if input = 2
                algorithmGame()
            else
                print "bad input"
    }

    public playerGame() {
        int randomNum
        put random number in randomNum
        int guess

        print "guess a number between 0 and 100"

        keepGoing = true
        while keepGoing
            guess = input nextline
            if guess = randomNum
                print "you win"
                keepgoing = false
            else if guess < randomNum
                print "too low"
            else 
                print "too high"
    }

    public algorithmGame() {
        int aGuess = 50

        print "think of a number between 0 and 100"

        keepGoing = true
        while keepGoing
            print guess
            printAlgorithmGameMenu()
            input = getline
            if input = l
                guess -= guess/2
            else if input = h
                guess += guess/2
            else if input = c
                print something
                keepGoing = false
            else
                print "invalid input"


    }

    public printMenu() {
        print out the menu options
    }

    public printAlgorithmGameMenu() {
        print out the menu options for the algorithm game
    }

    public static void main(String[] args) {
        create guessing game
        run guessing game
    }
}
```