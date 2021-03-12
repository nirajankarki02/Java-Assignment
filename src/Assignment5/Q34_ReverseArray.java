package Assignment5;

import java.util.Scanner;

public class Q34_ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of your array: ");
        int len = input.nextInt();
        System.out.println("Enter the Values of an Array: ");

        int arr [] = new int[len];
        for (int i = 0; i < len; ++i)
        {
            arr [i] = input.nextInt();
        }
        System.out.println("Array in Reverse Order is: ");
        for (int i = arr.length-1; i >= 0; --i){

            System.out.print(arr[i]+ " ");
        }
    }
}
