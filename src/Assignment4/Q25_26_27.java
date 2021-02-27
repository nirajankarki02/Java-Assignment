package Assignment4;

import java.util.Scanner;

//Using Non-statics Methods
public class Q25_26_27 {

    public void student(){
        //25. Write a program that prompts the user to enter the number
        // of students and each student’s name and score.
        // Finally display the student with the highest score.

        System.out.println("Question 25. Display the student with the highest score");

        Scanner input = new Scanner(System.in);
        int highest_score = 0;
        String highest_scorer_name = "";

        System.out.println("Enter number of Students: ");
        int num = input.nextInt();
        //System.out.println("Enter name of Student: ");
        //String name = input.next();

        for (int i= 1; i <= num; ++i)
        {
            System.out.println("Enter full name of Student: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.println("Enter Score of the Student: ");
            int score = input.nextInt();

            if (score > highest_score)
            {
                highest_score = score;
                highest_scorer_name = name;
            }
        }
        System.out.println("the highest score is: "+highest_score);
        System.out.println("Highest scorer name is: "+highest_scorer_name);
        System.out.println("======================");
    }

    public void reverse(){
       //26. Write a Program to reverse the given number. //123 => 321
        Scanner input = new Scanner(System.in);
        System.out.println("Question 26. Reverse the given number");
        System.out.println("Enter a number to reverse: ");
        int num = input.nextInt();
        System.out.println("The Original number is: "+num);
        int rev_num = 0;
        if (num < 10){
            //System.out.println("The Original number is: "+num);
            System.out.println("The reversed number is "+num);
        }
        else
        {
            while (num != 0)
            {
                int dig = num % 10;
                rev_num = rev_num * 10 + dig;
                num = num / 10;
            }
            //System.out.println("The Original number is: "+num);
            System.out.println("Reversed number is: " +rev_num);
            System.out.println("======================");
        }
    }

    public void sumProductDigits(){
        //sum each digit of given number as well as product.
        System.out.println("Question 27. Sum and Product of each digit of given number");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        int sum = 0;
        int product = 1;
        int new_num = 0;

        if (num < 10)
        {
            System.out.println("Sum is: "+num);
            System.out.println("Product is: "+num);
        }
        else
        {
            while(num != 0)
            {
                new_num = num%10;
                num = num / 10;
                sum = sum + new_num;
                product = product * new_num;
            }
            System.out.println("The product is: "+product);
            System.out.println("Sum is: "+sum);
        }

    }


    public static void main(String[] args) {
        //Calling Highest score and Student

        Q25_26_27 ob25 = new Q25_26_27();
        ob25.student();
        System.out.println();


        //calling reversed number
        Q25_26_27 ob26 = new Q25_26_27();
        ob26.reverse();
        System.out.println();

        //calling Sum and product of each digit
        Q25_26_27 ob27 = new Q25_26_27();
        ob27.sumProductDigits();
        System.out.println();
    }
}
