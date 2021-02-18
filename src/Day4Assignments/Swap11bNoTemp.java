package Day4Assignments;

import java.util.Scanner;

public class Swap11bNoTemp {
    //10. Write a program to swap two numbers
    //     b) without temp variable

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type a number: ");
        float a = input.nextFloat();
        System.out.println("Type second number: ");
        float b = input.nextFloat();
        System.out.println("Original Numbers are: \n\ra= "+a+" and b= "+b+"");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Numbers after SWAP are:\n\ra= "+a+" and b= "+b+"");

    }
}
