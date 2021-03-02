package Assignment5;

import java.util.Scanner;


public class Q32_33_Array {
    //main
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
        //Calling Q32 Sum of elements of an Array
        arraySum(arr);

        //Calling Q33 Ascending Order Array
        System.out.println("Original Array: ");
        for (int i = 0; i < len; ++i){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\nArray in ascending order is: \n");
        ascendingArray(arr);

        //Calling Q34 Reverse Array
        //System.out.println("Array in Reverse Order is: ");
        //Q32_33_34Array ob34 = new Q32_33_34Array();
        //ob34.reverseArray(arr);
    }

    //Q32.Write a Program to accept 5 values in an array and display their sum.
    public static void arraySum(int arr []){
        int sum = 0;

        for (int i = 0; i < arr.length; ++i){
           sum = sum + arr[i];
        }

        System.out.println("Sum of the elements of the array is: "+sum);
        System.out.println("================\n");
    }

    //Q33.Write a Program to display numbers in ascending order in array.
    public static void ascendingArray(int arr[]){
        int temp = 0;
        for (int i = 0; i < arr.length; ++i){
            for (int j = i+1; j < arr.length; ++j){
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i= 0; i < arr.length; ++i){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("================\n");
    }
/*
    //Q34.Write a program to reverse the element of an array.
    public void reverseArray(int arr[]){
        for (int i = arr.length-1; i >= 0; --i){

            System.out.print(arr[i]+ " ");
        }
    }

 */


}
