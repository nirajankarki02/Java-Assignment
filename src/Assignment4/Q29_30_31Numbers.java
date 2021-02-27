package Assignment4;

import java.util.Scanner;

public class Q29_30_31Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Q29
        System.out.println("Q29. Solve Mathematical Formula:");
        System.out.println("Enter the nth number: ");
        int n = input.nextInt();
        Q29_30_31Numbers ob29 = new Q29_30_31Numbers();
        ob29.Formula29Math(n);
        System.out.println("==================\n");

        //Q30
        System.out.println("Q30. Fibonacci Series:");
        System.out.println("Enter the length of Fibonacci series: ");
        int fib = input.nextInt();
        System.out.println("Your Fibonacci Series is: ");
        Q29_30_31Numbers ob30 = new Q29_30_31Numbers();
        ob30.Fibonacci(fib);
        System.out.println("\n==================\n");

        //Q31. Pattern
        System.out.println("Q31. Pattern:");
        System.out.println("Enter nth number for the pattern: ");
        int nth = input.nextInt();
        System.out.println("Desired pattern of number of nth term is: ");
        Q29_30_31Numbers ob31 = new Q29_30_31Numbers();
        ob31.Pattern(nth);
    }

    //Q29. Sum
    public void Formula29Math(int n){
        double fact = 1;
        //int n=0;
        double sum = 0;
        for (int i = 1; i <= n; ++i)
        {
           fact = fact * i;
           sum = sum + (i / fact);
        }
        System.out.println("The Sum of the Series is: "+sum);
    }

    //Q30. Write a program to print the Fibonacci series. 1 1 2 3 5 8 ….
    public void Fibonacci(int fib){
        int num1 = 0, num2 = 1;
        int i = 1;
        while (i <= fib)
        {
            System.out.print(num1+ " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            ++i;
        }

    }

    //Q31. Pattern:
    public void Pattern(int nth){

        for (int i = 1; i <= nth; ++i)
        {
            for (int j = 1; j <= i; ++j)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
