package Assignment6;

import java.util.Locale;
import java.util.Scanner;

public class Q42DuplicateWord {
    //42.	Write a program to find the duplicate word from a long string.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String line = input.nextLine();

        isDuplicateWord(line);

    }

    public static void isDuplicateWord(String line){
        int count = 0;
        String newLine = line.toLowerCase();
        String splitedWord [] = newLine.split(" ");

        for (int i = 0; i < splitedWord.length; ++i){
            count = 1;
            for (int j = i+1; j < splitedWord.length; ++j){
                if (splitedWord[i].equals(splitedWord[j]) )
                {
                    count = count + 1;
                    splitedWord[j] = "0";
                }
            }
            if(count > 1 && splitedWord[i] != "0")
                System.out.println(splitedWord[i]);
        }


    }


}
