package Day3Assignments;


import javax.swing.*;

public class MathematicalFunctionA {
    public static void main(String[] args) {
        //10a. s = ut + 1/2 at2
        double velocity = Double.parseDouble(JOptionPane.showInputDialog("Enter Initial Velocity: "));
        double time = Double.parseDouble(JOptionPane.showInputDialog("Enter time: "));
        double acceleration = Double.parseDouble(JOptionPane.showInputDialog("Enter acceleration: "));

        double displacement = (velocity * time) + 0.5 * acceleration * time * time;

        System.out.println("The total displacement is: "+displacement);
        System.out.println("===========================================");









    }
}
