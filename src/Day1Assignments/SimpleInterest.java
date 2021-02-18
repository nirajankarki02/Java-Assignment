package Day1Assignments;

import javax.swing.*;

public class SimpleInterest {
    public static void main(String[] args) {
        int P = Integer.parseInt(JOptionPane.showInputDialog("Enter Principal amount: "));
        int T = Integer.parseInt(JOptionPane.showInputDialog("Enter Time: "));
        int R = Integer.parseInt(JOptionPane.showInputDialog("Enter Rate: "));

        int SimpleInterest =  (P*T*R)/100;

        System.out.println(SimpleInterest);
        System.out.println("The Simple Interest is : $" + SimpleInterest);

    }
}
