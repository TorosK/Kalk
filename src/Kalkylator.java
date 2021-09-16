// Grupparbeiten
// Grupp Matrix
// Toros
//
import java.util.Scanner;
public class Kalkylator {

    //Creates global constant variables that cannot be changed as minimum and maximum numbers for input purposes
    final static double MINIMUM = 0;
    final static double MAXIMUM = 1000;

    //Creates global variables that can be used to verify numbers
    static double num = 0;
    static double percentage = 0;

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("********* Welcome! *********\n");

        boolean menuLoop = true;
        while (menuLoop == true) {

            try {

                System.out.println("Please choose: ");
                System.out.println("\n1) Square Root ");
                System.out.println("2) Percent Calculation ");
                System.out.println("3) Pythagorean Theorem ");
                System.out.println("4) Area of a circle ");
                System.out.println("5) Exit ");
                System.out.println("\n***************************");

                int menuChoice = in.nextInt();

                if (menuChoice == 1) {
                    System.out.println("***Square root menu***\n\nPlease input a number: ");
                    double validNum = getVal(MINIMUM, MAXIMUM);
                    sqrtOf(validNum);
                    if (validNum != ) {

                    }
                    System.out.println("The square root of " + validNum + " is " + sqrtOf(validNum));
                    System.out.println("\nMake input to return to main menu...");
                    in.next();

                } else if (menuChoice == 2) {
                    // int validNum = getVal(MINIMUM, MAXIMUM);
                    double result = percent();
                    System.out.println(percentage + " percent of " + num + " is " + result);
                    System.out.println("\nMake input to return to main menu...");
                    in.next();

                } else if (menuChoice == 3) {
                    System.out.println("Please write the length of one of the square sides of the triangle: ");
                    double validNum = getVal(MINIMUM, MAXIMUM);
                    System.out.println("Please write the length of the other square side of the triangle: ");
                    double validNum2 = getVal(MINIMUM, MAXIMUM);
                    double result = pyth(validNum, validNum2);
                    if (result != 0) {
                        System.out.println("The result is: " + result);
                    } else if (result == 0) {

                    }
                    System.out.println("\nMake input to return to main menu...");
                    in.next();

                } else if (menuChoice == 4) {
                    System.out.println("Please enter the diameter of the circle in numbers only: ");
                    double validNum = getVal(MINIMUM, MAXIMUM);
                    double result = circleA(validNum);
                    if (result != 0) {
                        System.out.println("The full circle area is: " + result);
                    } else if (result == 0) {

                    }
                    System.out.println("\nMake input to return to main menu...");
                    in.next();
                } else if (menuChoice == 5) {
                    System.out.println("Shutting down...");
                    menuLoop = false;
                } else {
                    System.out.println("ERROR wrongful input!");
                }
            }
            catch (Exception e) {
                System.out.println("Wrongful input! Try again...");
                in.next();
            }
        }
    }

    public static double circleA (double x){
        double radius = x / 2;
        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }

    public static double pyth (double a, double b){
        a = a * a;
        b = b * b;
        double c = a + b;
        double result = Math.sqrt(c);
        return result;
    }

    public static double percent () {
        System.out.println("please input your number: ");
        num = getVal (MAXIMUM, MINIMUM);
        System.out.println("please input your percentage: ");
        percentage = getVal(MAXIMUM, MINIMUM);
        double num1 = num / 100;
        double num2 = num1 * percentage;
        return num2;
    }

    public static double sqrtOf (double y){
        double x = Math.sqrt(y);
        return x;
    }

    public static int getVal (int min, int max){
        //System.out.println("Input whole number: ");
        int x = 0;
        try {
            x = in.nextInt();

            if (x < min) {
                //System.out.println("Please input a positive number");
            } else if (x > max) {
                //System.out.println("Please input a smaller number than 1000");
            }
        }
        catch (Exception e){
            System.out.println("Error, please enter a number!");
        }
        return x;
    }

    public static double getVal ( double min, double max){
        double x = 0;
        try {

            x = in.nextDouble();

            if (x < min) {
                System.out.println("Please input a positive number");
            } else if (x > max) {
                System.out.println("Please input a smaller number than 1000");
            }
        }
        catch (Exception e){
            System.out.println("Error, please enter a number!\n\n(Please enter comma for decimal number)\nMake any input to return to main menu");
            in.next();
        }
        return x;
    }

    /*public static double checkInputError(double x) {
        if (x == 0) {
            System.out.println("Error!");
        }
        else if (x != 0) {
            // return x;
        }
        return x;
    } */



}