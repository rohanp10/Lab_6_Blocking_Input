import java.util.Scanner;

public class FuelCosts {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double numGallonsGas = 0;
        double fuelEfficiency = 0;
        double priceGallon = 0;

        double costHundredMiles;
        double gasDistance;

        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");

            if (in.hasNextDouble()) {
                numGallonsGas = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said the number of gallons of gas was: " + trash);
                System.out.println("You have to enter a valid amount!\n");
            }
        }
        while (!done);

        done = false;

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");

            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said the fuel efficiency was: " + trash);
                System.out.println("You have to enter a valid amount!\n");
            }
        }
        while (!done);

        done = false;

        do {
            System.out.print("Enter the price of gas per gallon: ");

            if (in.hasNextDouble()) {
                priceGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said the price of gas per gallon was: " + trash);
                System.out.println("You have to enter a valid amount!\n");
            }
        }
        while (!done);

        costHundredMiles = 100 / fuelEfficiency * priceGallon;
        gasDistance = numGallonsGas * fuelEfficiency;

        System.out.println("\nThe cost per 100 miles is $" + costHundredMiles);
        System.out.println("The car can go " + gasDistance + " miles with the gas in the tank");


    }
}
