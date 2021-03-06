// CALCULATOR
// A basic program that performs mathematical calculations based on user input

//Toros är dryg ;) hihi
//Grupp Matrix
//Julius, Toros, Erkan, Sahra
//2021-09-17
//2021-09-20 lägger till kommentarer
//Nu går detta att pusha

import java.util.Scanner;

public class Kalkylator {

    //Creates global constant variables that cannot be changed as minimum and maximum numbers for input purposes
    final static double MINIMUM = 0;
    final static double MAXIMUM = 1000;

    final static int INTMINIMUM = 0;
    final static int INTMAXIMUM = 1000;

    //Creates global variables for percentMethod, so they can be displayed to user
    static double num = 0;
    static double percentage = 0;

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        printMenu();
    }

    public static void printMenu(){
        System.out.println("********* Welcome! *********\n");

        boolean menuLoop = true;
        while (menuLoop == true) {


            System.out.println("Please choose: ");
            System.out.println("\n1) Square Root ");
            System.out.println("2) Percent Calculation ");
            System.out.println("3) Pythagorean Theorem ");
            System.out.println("4) Area of a circle ");
            System.out.println("5) Exit ");
            System.out.println("\n***************************");
            int menuChoice = getVal(INTMINIMUM, INTMAXIMUM);

            if (menuChoice == 1) {
                System.out.println("Please input a number: ");
                double validNum = getVal(MINIMUM, MAXIMUM);
                sqrtOf(validNum);
                System.out.println("The square root of " + validNum + " is " + sqrtOf(validNum));
                System.out.println("\nMake input to return to main menu...");
                in.next();

            } else if (menuChoice == 2) {
                double result = percent();
                System.out.println(percentage + " percent of " + num + " is " + result);
                System.out.println("\nMake input to return to main menu...");
                in.next();

            } else if (menuChoice == 3) {
                System.out.println("Please write the length of one of the square sides of the triangle: ");
                double validNum = getVal(MINIMUM, MAXIMUM);
                System.out.println("Please write the length of the other square side of the triangle: ");
                double validNum2 = getVal(MINIMUM, MAXIMUM);
                double result = pythagoras(validNum, validNum2);
                if (result != 0) {
                    System.out.println("The result is: " + result);
                }
                else if (result == 0 ){

                }
                System.out.println("\nMake input to return to main menu...");
                in.next();

            } else if (menuChoice == 4) {
                System.out.println("Please enter the diameter of the circle in numbers only: ");
                double validNum = getVal(MINIMUM, MAXIMUM);
                double result = circleA(validNum);
                if (result != 0) {
                    System.out.println("The full circle area is: " + result);
                }
                else if (result == 0 ){

                }
                System.out.println("\nMake input to return to main menu...");
                in.next();
            }
            else if (menuChoice == 5) {
                System.out.println("Shutting down...");
                menuLoop = false;
            }
            else {
                System.out.println("ERROR wrongful input!");
            }

        }

    }

    // HERE COMES ALL METHODS FOR CALCULATIONS
    public static double circleA (double x){
        double radius = x / 2;
        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }

    public static double pythagoras (double a, double b){
        a = a * a;
        b = b * b;
        double c = a + b;
        double result = Math.sqrt(c);
        return result;
    }

    public static double percent () {
        System.out.println("please input your number: ");
        num = getVal (MINIMUM, MAXIMUM);
        System.out.println("please input your percentage: ");
        percentage = getVal(MINIMUM, MAXIMUM);
        double num1 = num / 100;
        double num2 = num1 * percentage;
        return num2;
    }

    public static double sqrtOf (double y){
        double x = Math.sqrt(y);
        return x;
    }

    // input mismatch handling (used in main menu)
    public static int getVal (int min, int max){
        int x = 0;
        boolean sum = true;
        Scanner input = new Scanner(System.in);
        while (sum) {
            while (!input.hasNextInt()) {
                System.out.println("Type in a number between 0-5\n");
                input.nextLine();
            }
            x = input.nextInt();
            if (x <= max && x >= min) {

                sum = false;
            }  else {
                System.out.println("Invalid number: please try again\n(The limit is 0-5)\n");
                input.nextLine();
            }

        }
        return x;
    }
    // --------------------------------------------
    // input mismatch handling (used in all calculations / methods)
    public static double getVal ( double min, double max){
        double x = 0;
        boolean sum = true;
        Scanner input = new Scanner(System.in);
        while (sum) {
            while (!input.hasNextDouble()) {
                System.out.println("Type in a number between 0-1000\n(If number is a decimal, use COMMA)\n");
                input.nextLine();
            }
            x = input.nextDouble();
            if (x <= max && x >= min) {

                sum = false;
            }  else {
                System.out.println("Invalid number: please try again\n(The limit is 0-1000)\n");
                input.nextLine();
            }
        }
        return x;
    }
}
