package Assignment6;

import java.util.Scanner;
import java.util.SortedMap;

public class Q39ShortName {
    //39.	Write a Program to display names in short form. E.g. Ram Kishore Singh  -> R. k. Singh
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = input.nextLine();
        name = name.toUpperCase();

        isShortFormName(name);

    }

    public static void isShortFormName(String name){
        String [] newName  = name.split(" ");

        String str = "";
        int i;
        for (i = 0; i < newName.length-1; ++i){
            str = str.concat(newName[i].charAt(0)+".") ;
        }
        str = str.concat(newName[i].charAt(0)+newName[i].substring(1).toLowerCase()) ;
        System.out.println(str);


    }
}
