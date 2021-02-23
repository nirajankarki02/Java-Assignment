package Day8Assignments;

import java.util.Scanner;

public class Q17LeapYear {
    //17. Write a program to calculate leap year.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Year: ");
        int year = input.nextInt();

        //LOGIC Explained Below
        /*
        1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
        2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
        3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
        4. The year is a leap year (it has 366 days).
        5. The year is not a leap year (it has 365 days).
        */

        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println("The year is a Leap Year.");
                }
                else
                {
                    System.out.println("The year is not a Leap Year.");
                }
            }
            else
            {
                System.out.println("The year is a Leap Year.");
            }
        }
        else
        {
            System.out.println("The year is not a Leap Year.");
        }

    }
}
