package Day8Assignments;

import java.util.Scanner;

public class Q20FourFunCalcu {
    //20.
    //Write a program to create the equivalent of a four-function calculator.
    // The program to enter two integer’s numbers and an operator.
    // It then carries out the specified arithmetic operator operation:
    // addition, subtraction, multiplication or division of the two numbers.
    // Finally, it displays the result.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        System.out.println("Enter another number: ");
        int b = input.nextInt();
        //System.out.println("Options: add for addition; sub = subtraction mult = multiplication; div = Division ");
        System.out.println("Enter Operator for the Calculator (+ - * /): ");
        char x = input.next().charAt(0);

        switch (x){
            case '+':
                System.out.println("Addition is:");
                System.out.println(a+b);
                break;
            case '-':
                System.out.println("Subtraction is:");
                System.out.println(a-b);
                break;
            case '*':
                System.out.println("Multiplication is:");
                System.out.println(a*b);
                break;
            case '/':
                System.out.println("Division is:");
                System.out.println(a/b);
                break;
            default:
                System.out.println("Error in input. Try Again!!");

        }

        /*
        if (x == "add" || x == "ADD" || x == "Add" )
        {
            int sum = a + b;
            System.out.println("Sum of two numbers is: " +sum);
        }
        else if (x=="sub" || x == "Sub" || x == "SUB" )
        {
            int diff = a - b;
            System.out.println("Subtraction of two numbers is: " +diff);
        }
        else if (x=="mult" || x == "Mult" || x == "MULT" )
        {
            int product = a * b;
            System.out.println("Product of two numbers is: " +product);
        }
        else if (x=="div" || x == "Div" || x == "DIV" )
        {
            int division = a / b;
            System.out.println("Division of two numbers is: " +division);
        }*/

    }
}
