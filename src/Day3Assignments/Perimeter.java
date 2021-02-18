package Day3Assignments;

import javax.swing.*;

public class Perimeter {
    //6.Write a program to find the perimeter of a circle, triangle, and rectangle.
    public static void main(String[] args) {
        //1. Circle
        final double PI = 3.14;
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius of the circle: "));

        double Perimeter_of_Circle = 2*PI*radius;
        System.out.println("Perimeter of Circle is: "+Perimeter_of_Circle);
        System.out.println("++++++++++++++++++++++++++");

        //2.Triangle
        float length = Float.parseFloat(JOptionPane.showInputDialog("Enter Length of the Triangle: "));
        float width = Float.parseFloat(JOptionPane.showInputDialog("Enter width of the triangle: "));
        float base = Float.parseFloat(JOptionPane.showInputDialog("Enter base of the triangle: "));

        float Perimeter_of_Triangle = length+width+base;
        System.out.println("Perimeter of Triangle is: "+Perimeter_of_Triangle);
        System.out.println("++++++++++++++++++++++++++");

        //3.Rectangle
        float len = Float.parseFloat(JOptionPane.showInputDialog("Enter Length of the Rectangle: "));
        float wid = Float.parseFloat(JOptionPane.showInputDialog("Enter width of the Rectangle: "));

        float Perimeter_of_Rectangle = 2*(len+wid);
        System.out.println("Perimeter of Rectangle is: "+Perimeter_of_Rectangle);
        System.out.println("++++++++++++++++++++++++++");






    }
}
