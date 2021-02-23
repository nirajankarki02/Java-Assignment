package Day8Assignments;

import java.util.Scanner;

//14. Write a program to relate two integers entered by the user using = =or > or < sign.
public class Q14Integers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //First number
        System.out.println("Enter first number: ");
        int a = input.nextInt();

        //Second Number
        System.out.println("Enter second number: ");
        int b = input.nextInt();

        if (a > b)
        {
            System.out.println("a is greater than b.");
        }
        else if (a < b)
        {
            System.out.println("a is smaller than b.");
        }
        else if (a == b)
        {
            System.out.println("a is equals to b.");
        }

    }
}
