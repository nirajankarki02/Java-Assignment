package Assignment6;

import java.util.Scanner;

public class Q43ExceptionHandle {
    //43.	Write a program to trap the exception handling to trap the divided by zero and out of index value in array.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = input.nextInt();
        System.out.println("Enter num2: ");
        int num2 = input.nextInt();

        handleException(num1, num2);
    }

    public static void handleException(int num1, int num2) {
        try {
            int div = num1 / num2;
            System.out.println("The result of division of num1 and num2 is: " + div);
        } catch (ArithmeticException e) {
            // Exception handler
            System.out.println("Divided by zero operation cannot possible");

        }
    }
}
