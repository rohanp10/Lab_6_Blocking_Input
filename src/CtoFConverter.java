import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double tempC = 0;
        double tempF = 0;

        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the temperature in Celsius: ");

            if (in.hasNextDouble()) {
                tempC = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said the temperature in Celsius was: " + trash);
                System.out.println("You have to enter a valid amount!\n");
            }
        }
        while (!done);

        tempF = tempC * 9 / 5 + 32;

        System.out.println("The temperature in Fahrenheit is " + tempF + " degrees");

        }

    }
