/** 1.) Number Task Game :
 * 1. Generate a random number within a specified range, such as 1 to 100.
 * 2. Prompt the user to enter their guess for the generated number.
 * 3. Compare the user's guess with the generated number and provide feedback on whether the guess
 * is correct, too high, or too low.
 * 4. Repeat steps 2 and 3 until the user guesses the correct number.
 * You can incorporate additional details as follows:
 * 5. Limit the number of attempts the user has to guess the number.
 * 6. Add the option for multiple rounds, allowing the user to play again.
 * 7. Display the user's score, which can be based on the number of attempts taken or rounds won. */

package numberGameProject;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int score = 0;
        System.out.println("Welcome to the Number Guessing Game !");
        while(playAgain){
            int attempts = 0;
            int range = 5;
            int numberToGuess = random.nextInt(range) + 1;              // Computer's guesses random integers from 1 to 5
            boolean guessedCorrectly = false;
            System.out.println("\nComputer has selected a number between 1 and " + range + ".");
            System.out.println("Can you guess it ? ");
            while(!guessedCorrectly){
                System.out.print("Enter your guess : ");
                int guess = sc.nextInt();
                sc.nextLine();
                attempts++;
                if(guess == numberToGuess){
                    System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                    score = score + attempts;
                    guessedCorrectly = true;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low! Try guessing a higher number.");
                }
                else {
                    System.out.println("Too high! Try guessing a lower number.");
                }
                System.out.print("Do you want to play again? (yes/no): ");
                String playChoice = sc.nextLine().toLowerCase();
                if(!playChoice.equals("yes")){
                    playAgain = false;
                }
            }
            System.out.println("\nGame Over!");
            System.out.println("Your total score is: " + score + " points.");
            sc.close();
        }
    }
}