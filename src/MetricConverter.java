import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double meters = 0;

        double miles;
        double feet;
        double inches;

        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the measurement in meters: ");

            if (in.hasNextDouble()) {
                meters = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said the measurement in meters was: " + trash);
                System.out.println("You have to enter a valid amount!\n");
            }
        }
        while (!done);

        miles = meters / 1609.344;
        feet = meters * 3.28084;
        inches = meters * 39.3701;

        System.out.println("\nThe measurement in miles is " + miles + " miles");
        System.out.println("The measurement in feet is " + feet + " feet");
        System.out.println("The measurement in inches is " + inches + " inches");


    }
}
