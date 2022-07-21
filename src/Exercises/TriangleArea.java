package Exercises;

import java.util.Scanner;

public class TriangleArea {
    
    public static double trianguleArea(double b, double h) {
        return (b * h) / 2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        double b = sc.nextDouble();
        System.out.print("Altura: ");
        double h = sc.nextDouble();

        double area = trianguleArea(b, h);
        System.out.println("Area: " + area + " cm2");

        sc.close();
    }
}
