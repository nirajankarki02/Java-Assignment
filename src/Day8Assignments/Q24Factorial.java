package Day8Assignments;

import java.util.Scanner;

public class Q24Factorial {
    //24. Write a program to print the factorial number of given numbers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial: ");
        int f = input.nextInt();
        int fac = 1;

        while (f > 0)
        {
            fac = f * fac;
            --f;

        }
        System.out.println("Factorial of "+f+" is "+fac);
    }
}
