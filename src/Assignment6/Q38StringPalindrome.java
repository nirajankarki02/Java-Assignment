package Assignment6;

import java.util.Scanner;
import java.util.SortedMap;

public class Q38StringPalindrome {
    //38.	Write a program to check whether a given string is palindrome or not.


    public static boolean isPalindrome(String s1){
        StringBuffer sb = new StringBuffer(s1);
        sb.reverse();
        String s2 = sb.toString();

        if (s1.equals(s2)){
            System.out.println("Is Palindrome");
            return true;
        }
        else{
            System.out.println("Is Not Palindrome");
            return false;}


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to check if it is Palindrome: ");
        String s1 = input.next();
        isPalindrome(s1);

    }
}
