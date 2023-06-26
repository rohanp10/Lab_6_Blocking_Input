import java.util.Scanner;

public class RectangleInfo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;

        double area;
        double perimeter;
        double diagonalLength;

        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the width of the rectangle: ");

            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said the width of the rectangle was: " + trash);
                System.out.println("You have to enter a valid amount!\n");
            }
        }
        while (!done);

        done = false;

        do {
            System.out.print("Enter the height of the rectangle: ");

            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said the height of the rectangle was: " + trash);
                System.out.println("You have to enter a valid amount!\n");
            }
        }
        while (!done);

        area = width * height;
        perimeter = width * 2 + height * 2;
        diagonalLength = Math.pow((Math.pow(width, 2) + Math.pow(height, 2)), 0.5);

        System.out.println("\nThe area of the rectangle is " + area + " units squared");
        System.out.println("The perimeter of the rectangle is " + perimeter + " units");
        System.out.println("The length of the diagonal is " + diagonalLength + " units");



    }
}
