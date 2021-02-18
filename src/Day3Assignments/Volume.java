package Day3Assignments;

import java.util.Scanner;

public class Volume {
    //7.Volume of Cylinder
    public static void main(String[] args) {
        //V=pir2h
        final double PI = 3.41;
        Scanner radius = new Scanner(System.in);
        System.out.println("Enter radius of the Cylinder: ");
        double r = radius.nextDouble();
        Scanner height = new Scanner(System.in);
        System.out.println("Enter height of the Cylinder: ");
        double h = height.nextDouble();

        double Volume = PI*r*r*h;
        System.out.println("Volume of the Cylinder is "+Volume);
    }
}
