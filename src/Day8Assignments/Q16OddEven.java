package Day8Assignments;

import java.util.Scanner;

public class Q16OddEven {
    //16. Write a program to find the given number is even or odd.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int x = input.nextInt();

        if (x % 2 == 0)
        {
            System.out.println("The Number is EVEN.");
        }
        else
        {
            System.out.println("The Number is ODD.");
        }
    }
}
