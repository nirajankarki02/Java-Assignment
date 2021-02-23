package Day8Assignments;

import java.util.Scanner;

public class Q19Triangles {
    //19. Write a Program to accept three sides of a triangle and display which kind of triangle is formed.

    /*
    Equilateral Triangle: A triangle is said to be equilateral triangle if
    all the sides are equal.

    Isosceles Triangle: A triangle is said to be an isosceles triangle
    if any of its two sides are equal.

    Scalene Triangle: A triangle is said Scalene Triangle if none of its sides is equal.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Sides of a Triangle: X = ");
        int X = input.nextInt();
        System.out.println("Enter Sides of a Triangle: Y = ");
        int Y = input.nextInt();
        System.out.println("Enter Sides of a Triangle: Z = ");
        int Z = input.nextInt();

        if (X == Y && Y == Z)
        {
            System.out.println("It is an Equilateral Triangle.");
        }
        else if (X == Y || Y == Z || X == Z)
        {
            System.out.println("It is an Isosceles Triangle.");
        }
        else
        {
            System.out.println("It is a Scalene Triangle.");
        }

    }
}
