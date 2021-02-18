package Day3Assignments;

import javax.swing.*;
import java.util.Scanner;

     //5.Write a program to find the area of a circle, rectangle, and triangle.
public class Area {
    public static void main(String[] args) {

        //.Calculate Area of Circle
        // A = pi*r*r
        final double pi = 3.14;
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius of the circle: "));

        double Area_of_Circle = pi*radius*radius;

        System.out.println("Area of the Circle is: " +Area_of_Circle);
        System.out.println("=========================");

        //2. Area of a Rectangle
        Scanner length = new Scanner(System.in);
        System.out.println("Enter Length of the Rectangle: ");
        double l = length.nextDouble();

        Scanner width = new Scanner(System.in);
        System.out.print("Enter Width of the rectangle: ");
        double w = width.nextDouble();

        double Area_of_Rectangle = l*w;

        System.out.println("Area of Rectangle is: " +Area_of_Rectangle);
        System.out.println("=========================");

        //2. Area of a Triangle
        double base = Double.parseDouble(JOptionPane.showInputDialog("Enter base of the triangle: "));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height of the triangle: "));

        double Area_of_Triangle = (base*height)/2;

        System.out.println("Area of the Triangle is: " +Area_of_Triangle);








    }
}
