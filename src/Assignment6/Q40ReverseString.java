package Assignment6;

import java.util.Scanner;

public class Q40ReverseString {
    //40.	Write a program to reverse the string.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = input.next();
        Q40ReverseString ob = new Q40ReverseString();
        ob.isReversedString(str);
    }

    public void isReversedString(String str){
        StringBuilder sb = new StringBuilder(str);

        sb.reverse();
        System.out.println("Original String is: "+str);
        System.out.println("Reversed String is: "+sb);

    }


}
