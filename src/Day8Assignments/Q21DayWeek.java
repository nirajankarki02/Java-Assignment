package Day8Assignments;

import java.util.Scanner;

public class Q21DayWeek {
    //21. Program to input the number of (1...7) and translate to its equivalent name of the day of the week.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Number from 1 to 7: ");
        int count = input.nextInt();

        switch (count)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong Input. Input should be from 1 to 7.");


        }

    }
}
