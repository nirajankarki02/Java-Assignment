package Day3Assignments;

import javax.swing.*;

//8.convert Fahrenheit to Celsius and Celsius to Fahrenheit
public class CelsiusFahrenheit {
    public static void main(String[] args) {
        //Fahrenheit to Celsius
        float Fahrenheit = Float.parseFloat(JOptionPane.showInputDialog("Enter Temperature in Fahrenheit: "));
        double F_to_C = (Fahrenheit - 32) * 0.5556;
        System.out.println(""+Fahrenheit+" degree Fahrenheit in Celsius is: "+F_to_C);

        //Celsius to Fahrenheit
        float Celsius = Float.parseFloat(JOptionPane.showInputDialog("Enter Temperature in Celsius: "));
        double C_to_F = Celsius * 1.8 + 32;
        System.out.println(""+Celsius+" degree Celsius in Fahrenheit is: "+C_to_F);
    }

}
