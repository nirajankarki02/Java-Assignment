package Day1Assignments;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int a = num.nextInt();
        System.out.println("Enter a number: ");
        int b = num.nextInt();

        int sum = a+b;
        int average = sum/2;

        System.out.println("The Sum of two numbers is: " +sum);
        System.out.println("The Average of two numbers is: "+average);
    }
}
