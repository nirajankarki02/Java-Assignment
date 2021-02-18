package Day4Assignments;

import java.util.Scanner;

public class Display12Values {
    // 12. Write a program to accept the roll, name, and nationality of the person
    // and display those values in good format.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type Your Roll number: ");
        int roll = input.nextInt();

        input.nextLine();

        System.out.print("Enter Your Name: ");
        String name = input.nextLine();

        //System.out.println("Type Your First Name: ");
        //String name = input.nextLine();
        //System.out.println("Type Your Last Name: ");
        //String lname = input.next();

        System.out.println("Type Your Nationality: ");
        String nationality = input.next();

        System.out.println("Information of Student");
        System.out.println("Roll: "+roll);
        //System.out.println("Name: "+fname+" "+lname+"");
        System.out.println("Name: "+name);
        System.out.println("Nationality: "+nationality);
    }

}
