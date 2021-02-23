package Day8Assignments;

import java.util.Scanner;

public class Q18LargestNo {
    //18. Write a program to display the largest number from given three values.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = input.nextInt();

        System.out.println("Enter second number: ");
        int b = input.nextInt();

        System.out.println("Enter third number: ");
        int c = input.nextInt();

        if (a >= b && a >= c)
        {
            System.out.println("The largest number is a = "+a);
        }
        else if (b >= a && b >= c)
        {
            System.out.println("The largest number is  = "+b);
        }
        else
        {
            System.out.println("The largest number is  = "+c);
        }
    }
}
