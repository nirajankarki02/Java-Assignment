package Day3Assignments;

import javax.swing.*;

public class MathematicalFunctionB {
    public static void main(String[] args) {
        //10b: area = sq rt s(s-a)(s-b)(s-c)
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter side1 of a triangle: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter side2 of a triangle: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter side3 of a triangle: "));

        double s = (a+b+c)/2;
        double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area: "+Area);
        System.out.println("===========================================");
    }
}
