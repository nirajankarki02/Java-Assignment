package Day8Assignments;

import java.util.Scanner;

public class Q22Table {
    //22. Write a program to print the table of given numbers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = input.nextInt();

        System.out.println("The table of "+x+" is: ");

        for (int i = 1; i <= 25; i++)
        {
            int y = x * i;
            System.out.println(""+x+" * "+i+" = "+y+"");
        }
    }
}
