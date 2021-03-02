package Assignment5;

import java.util.Scanner;

public class Q37Matrix {
    public static void main(String[] args) {
        int a [][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b [][] = {{4,5,6},{2,7,8},{3,1,9}};

        System.out.println("Sum of two Matrices is: ");
        int sum[][] = addMatrix(a,b);
        displayMatrix(sum);

    }

    public static int[][] addMatrix(int a[][], int b[][]){
        int sum [][] = new int [3][3];
        for (int i = 0; i < 3; ++i){
            for (int j = 0; j < 3; ++j){
                sum [i][j] = a[i][j] + b[i][j];
                //System.out.print(sum[i][j]+" ");
            }
        }
        return sum;
    }

    public static void displayMatrix(int sum[][]){
        for (int i = 0; i < 3; ++i){
            for (int j = 0; j < 3; ++j){
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
