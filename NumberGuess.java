
import java.util.*;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String args[]) {
        Scanner sca = new Scanner(System.in);
        Random rd = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        int score = 0;
        
        System.out.println("Welcome to the Number Guessing Game :-");
        System.out.println("I am thinking of a number between " + lowerBound + " and " + upperBound);
        
        boolean replay = true;
        while (replay) {
            int secretNumber = rd.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;
            
            System.out.println("You have " + maxAttempts + " attempts to guess the number");
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sca.nextInt();
                attempts++;
                
                if (userGuess < lowerBound || userGuess > upperBound) {
                    System.out.println("Please guess a number between " + lowerBound + " and " + upperBound);
                    continue;
                }
                
                if (userGuess == secretNumber) {
                    System.out.println("Congratulations, You guessed the number " + secretNumber + " in " + attempts + " attempts");
                    score++;
                    hasGuessedCorrectly = true;
                    break;
                } 
                else if (userGuess < secretNumber) {
                    System.out.println("Try a higher number");
                } 
                else {
                    System.out.println("Try a lower number");
                }
                
                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }
            
            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you hava run out of attempts. The correct number was " + secretNumber);
            }
            
            System.out.println("Your current score: " + score);
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = sca.next().toLowerCase();
            replay = playAgainResponse.equals("yes");
        }
        
        System.out.println("Thanks you for playing");
    }
}