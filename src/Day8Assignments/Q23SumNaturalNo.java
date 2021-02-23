package Day8Assignments;

import java.util.Scanner;

public class Q23SumNaturalNo {
    //23. Write a Program to sum 1 to nth natural numbers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter nth of your choice: ");
        int n = input.nextInt();
        int sum=0;
        int count = 0;

        while (count <= n)
        {
            sum = sum + count;
            ++count;
        }
        System.out.println("The Sum is "+sum);
    }
}
