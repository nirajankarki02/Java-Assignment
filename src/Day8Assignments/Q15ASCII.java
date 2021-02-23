package Day8Assignments;

import java.util.Scanner;

//15. Write a program that receives an ASCII code (between 0 – 128)
// and display its character [example: 97 (input) ->a(output)].
public class Q15ASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ASCII code: ");
        int code = input.nextInt();
        input.close();

        if (code <= 128 && code >= 0)
        {
            System.out.println("Character for your ASCII code "+code+" is: " + (char)code);
            //System.out.println((char) code);
        }


    }
}
