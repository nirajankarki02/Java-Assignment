package Assignment5;

import java.util.Scanner;

public class Q35_36_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of an array: ");
        int len = input.nextInt();
        System.out.println("Enter the Values of an Array: ");
        int arr [] = new int[len];
        for (int i = 0; i < len; ++i)
        {
            arr [i] = input.nextInt();
        }

        //Calling Q35 second largest element of array
        Q35_36_Array ob35 = new Q35_36_Array();
        ob35.secondLargest(arr);

        //Calling Q36 duplicate elements in an array
        System.out.println("The duplicate elements of the array are: ");
        Q35_36_Array ob36 = new Q35_36_Array();
        ob36.duplicateElement(arr);
    }

    //Q35.Write a function to find the second largest number in a given array.
    public void secondLargest(int arr[]){
        //arranging in descending order
        for (int i = 0; i < arr.length; ++i){
            for (int j = i+1; j < arr.length; ++j){
                if (arr[i] < arr [j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();
        //second element of array in descending order is the second largest element
        System.out.println("The Second Largest Element in the Array is: "+arr[1]);
        System.out.println();
    }

    //Q36.Write a function to find duplicate elements in an array.
    public void duplicateElement(int arr[]){
        int count = 0;
        for (int i= 0; i < arr.length; ++i){
            for (int j = i+1; j < arr.length; ++j){
                if (arr[i] == arr[j])
                {
                    System.out.println(arr[i]);
                }

            }
        }
    }


}
