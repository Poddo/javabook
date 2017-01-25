/*
 */
package chapter2;

import java.util.Scanner;

/**
 *
 * @author bpodgorski
 */
public class TriangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("Enter x3 and y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        //compute side 1
        double a = Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2));
        double side1 = Math.pow(a, .5);
        //compute side2
        a = Math.pow(x3 - x2, 2) + (Math.pow(y3 - y2, 2));
        double side2 = Math.pow(a, .5);
        //compute side3
        a = Math.pow(x3 - x1, 2) + (Math.pow(y3 - y1, 2));
        double side3 = Math.pow(a, .5);
        //compute s
        double s = (side1 + side2 + side3)/2;
        //compute area
        double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), .5);
        
        System.out.println("The area is: " + area);
    }
}
