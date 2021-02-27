package Assignment4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Q28A28B28CPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //isPrimeNumber
        System.out.println("28a. If the number is Prime?");
        System.out.println("Enter a Number to Check if it is a Prime Number: ");
        int if_prime = input.nextInt();

        if (isPrimeNumber(if_prime)){
            System.out.println(if_prime+ " is a Prime Number.");
        }
        else {
            System.out.println(if_prime+ " is not a Prime Number.");
        }
        System.out.println("====================");
        System.out.println();

        //FirstNthPrime
        System.out.println("Q28b. First nth prime numbers.");
        System.out.println("Enter value of n to print first Nth Prime Numbers : ");
        int n = input.nextInt();
        firstNthPrime(n);
        System.out.println("====================");
        System.out.println();

        //Prime Number between Numbers
        System.out.println("Q28c. Checking for Prime Numbers between two numbers.");
        System.out.println("Enter Starting Number: ");
        int start = input.nextInt();
        System.out.println("Enter End Numbers : ");
        int end = input.nextInt();
        System.out.println("Prime Numbers between "+start+" and "+end+" is: ");
        allPrimeBetween(start,end);

    }

    //28a. isPrimeNumber
    public static boolean isPrimeNumber(int if_prime){

        if (if_prime <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(if_prime); ++i)
        {
            if (if_prime % i == 0)
            {
                return false;
            }

        }
        return true;
    }

    //28b. First Nth Prime
    public static void firstNthPrime(int n){
        int num = 2;
        int count = 0;

        while (count < n)
        {
            if (isPrimeNumber(num))
            {
                System.out.println(num+ " ");
                //count++;
            }
            count++;
            num++;
        }
    }


    //28c. allPrimeNumberBetween
    public static void allPrimeBetween(int start , int  end){
        int count = 0;
        for (int i = start; i <= end; i++)
        {
            count = 0;
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0)
                {
                    count++;
                }
            }
            if (count == 2)
            {
                System.out.println(i);
            }
        }

    }

}
