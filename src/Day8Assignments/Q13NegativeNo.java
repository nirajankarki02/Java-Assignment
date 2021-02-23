package Day8Assignments;

import java.util.Scanner;

//13.Write a program to print the number entered by the user only if the number entered is negative.
public class Q13NegativeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a Number: ");
        int num = input.nextInt();

        if (num < 0){
            System.out.println("You Entered "+num+".");
        }
        else{
            System.out.println("Invalid Number.");
        }


    }

}
