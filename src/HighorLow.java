import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Random generator = new Random();
        int val = generator.nextInt(10) + 1;

        int userGuess = 0;

        String trash = "";
        boolean done = false;

        do {
            System.out.print("Guess the randomly generated number with a single guess [1-10]: ");

            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                in.nextLine();
                if (userGuess >= 1 && userGuess <= 10){
                    done = true;
                }
                else {
                    System.out.println("\nYour guess must be between 1 and 10\n");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said your guess for the number was: " + trash);
                System.out.println("You have to enter a valid amount!\n");
            }
        }
        while (!done);

        System.out.println("\nThe random number was " + val);
        if (userGuess > val){
            System.out.println("Your guess was higher than the actual number");
        }
        else if (userGuess < val){
            System.out.println("Your guess was lower than the actual number");
        }
        else {
            System.out.println("Your guess was on the money!");
        }


    }
}
