package Day3Assignments;

import javax.swing.*;

public class PoundKg {
    //9.converts pounds into kg
    public static void main(String[] args) {
        double wt_IN_lb = Double.parseDouble(JOptionPane.showInputDialog("Enter Weight in Pounds: "));
        double lb_TO_kg = wt_IN_lb * 0.454;
        System.out.println(""+wt_IN_lb+" pounds in kilogram equals to "+lb_TO_kg+" kg.");
    }
}
