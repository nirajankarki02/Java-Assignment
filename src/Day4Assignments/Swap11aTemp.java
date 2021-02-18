package Day4Assignments;

import java.util.Scanner;

public class Swap11aTemp {
    //11. Write a program to swap two numbers
    //   a) using temp variable
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type a number: ");
        float a = input.nextFloat();
        System.out.println("Type second number: ");
        float b = input.nextFloat();
        System.out.println("Original Numbers are: \n\ra= "+a+" and b= "+b+"");
        float temp;

        //SWAP
        temp = a;
        a = b;
        b = temp;

        System.out.println("Numbers after SWAP are:\n\ra= "+a+" and b= "+b+"");




    }
}
