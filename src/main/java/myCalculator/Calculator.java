package myCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static double root(int num) {
        Scanner sc = new Scanner(System.in);
        while(num < 0) {
            System.out.print("Please enter a positive number: ");
            num = sc.nextInt();
        }
        logger.info("[SQUARE ROOT - " + num + " ]");
        double answer = Math.sqrt(num);
        logger.info("[SQUARE ROOT ANSWER - " + answer  + " ]");
        return answer;
    }

    public static int factorial(int num) {
        Scanner sc = new Scanner(System.in);
        while(num < 0) {
            System.out.print("Please enter a positive number: ");
            num = sc.nextInt();
        }
        logger.info("[FACTORIAL - " + num + " ]");
        int answer = 1;
        for(int i = 2; i <= num; i++) {
            answer *= i;
        }
        logger.info("[FACTORIAL ANSWER - " + answer + " ]");
        return answer;
    }

    public static double logarithm(int num) {
        Scanner sc = new Scanner(System.in);
        while(num < 0) {
            System.out.print("Please enter a positive number: ");
            num = sc.nextInt();
        }
        logger.info("[LOGARITHM - " + num + " ]");
        double answer = Math.log(num);
        logger.info("[LOGARITHM ANSWER - " + answer + " ]");
        return answer;
    }

    public static double power(int n1, int n2) {
        logger.info("[POWER - " + n1 + " AND " + n2 + " ]");
        double answer = Math.pow(n1, n2);
        logger.info("[POWER ANSWER - " + answer + " ]");
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("***************************************");
        System.out.println("This is a scientific calculator program");
        System.out.println("***************************************");
        Scanner sc = new Scanner(System.in);
        int check = 1;
        while(check != 0) {
            System.out.println("***************************************");
            System.out.println("Select an operation from the below options: ");
            System.out.println("1. Square Root Function");
            System.out.println("2. Factorial Function");
            System.out.println("3. Natural Logarithm Function");
            System.out.println("4. Power Function");
            System.out.println("5. Exit Program");
            System.out.print("Enter your input: ");
            int option = 0;
            try {
                option = sc.nextInt();
            }
            catch (InputMismatchException excep) {
                System.out.println("There was a error in recording your selctions. Please try again.");
            }
            int n = 0;
            if(option == 1) {
                System.out.print("Enter the input for square root function: ");
                n = sc.nextInt();
                double answer = root(n);
                System.out.println("The square root of the input number is: " + answer);
            }
            else if(option == 2) {
                System.out.print("Enter the input for factorial function: ");
                n = sc.nextInt();
                double answer = factorial(n);
                System.out.println("The factorial of the input number is: " + answer);
            }
            else if(option == 3) {
                System.out.print("Enter the input for natural logarithm function: ");
                n = sc.nextInt();
                double answer = logarithm(n);
                System.out.println("The natural logarithm of the input number is: " + answer);
            }
            else if(option == 4) {
                System.out.print("Enter the input for power function: ");
                int n1 = sc.nextInt(), n2 = sc.nextInt();
                double answer = power(n1, n2);
                System.out.println("The output of the power function is: " + answer);
            }
            else if(option == 5) {
                check = 0;
            }
        }
        System.out.println("***************************************");
        System.out.println("Thank you for using my Calculator program");
        System.out.println("***************************************");
    }
}
