package Assignment6;

import java.util.Scanner;

public class Q41DuplicateLetter {
    //41.	Write a program to find the duplicate letter in a word.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.next();

        isDuplicateLetter(word);
    }

    public static void isDuplicateLetter(String word){
        int count = 0;
        String low_word = word.toLowerCase();
        //System.out.println(low_word);
        char [] ch = low_word.toCharArray();
        //System.out.println("Duplicate letters in the word are: ");
        for (int i = 0; i < ch.length; ++i){
            for (int j = i+1; j < ch.length; ++j){
                if (ch[i] == ch[j])
                {
                    count = count + 1;
                    System.out.println("Duplicate letter: "+ch[i]);

                }

            }
        }
        if (count == 0){
            System.out.println("No duplicate letters in the word");
        }

    }
}
