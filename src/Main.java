import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        double meters = 0;
        boolean done1 = false;
        final double METERS_TO_MILES = 0.00062137;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.37008;

        do {
            System.out.println("Enter a meter measurement:");
            if (scan.hasNextDouble()) {
                meters = scan.nextDouble();
                scan.nextLine();
                if (meters < 0) {
                    System.out.println("You have entered an invalid value, Please try again");
                }
                if (meters >= 0) {
                    done1 = true;
                }
            }
            else {
                System.out.println("You have entered an invalid value, Please try again");
                scan.nextLine();

            }
        }while (!done1);
        System.out.printf("\n%-10s%5.2f", "meters: ", meters);
        System.out.printf("\n%-9s%5.2f", "miles: ", meters * METERS_TO_MILES);
        System.out.printf("\n%-10s%5.2f", "feet: ", meters * METERS_TO_FEET);
        System.out.printf("\n%-10s%5.2f", "inches: ", meters * METERS_TO_INCHES);

    }

}