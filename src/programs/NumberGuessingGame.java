
    package programs;
// Java program for number guessing game
import java.util.Scanner;
    public class NumberGuessingGame {
        public static void NumberguessingGame(){
            Scanner sc = new Scanner(System.in);
            // Generate the numbers to be guessed
            int number = 1 + (int)(100 * Math.random());
            int K = 10;
            int i, guess;

            System.out.println("choose a number" + " between 1 to 100." + "Guess the number" + " within 10 trials.");

            // Iterate over K Trials
            for (i = 0; i < K; i++) {

                System.out.println("Guess the number:");

                // Take input for guessing
                guess = sc.nextInt();

                // If the number is guessed
                if (number == guess) {
                    System.out.println("Congratulations You guessed the correct number.");
                    break;
                }
                else if (number > guess && i != K - 1) {
                    System.out.println("The number is " + "greater than " + guess);
                }
                else if (number < guess && i != K - 1) {
                    System.out.println("The number is" + " less than " + guess);
                }
            }

            if (i == K) {
                System.out.println("You have crossed the K trials of guessing.");

                System.out.println("The correct number was " + number);
            }
        }

        // Driver Code
        public static void main(String arg[]) {

            // Function Call
            NumberguessingGame();
        }
    }

