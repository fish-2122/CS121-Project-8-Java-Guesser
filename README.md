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
            
    }

    public algorithmGame() {

    }

    public printMenu() {
        
    }

    public static void main(String[] args) {
        create guessing game
        run guessing game
    }
}
```