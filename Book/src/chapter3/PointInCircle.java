/*
 */
package chapter3;

import java.util.Scanner;

/**
 *
 * @author bpodgorski
 */
public class PointInCircle {
    public static void main(String[] args){
        //check if point given is in a circle of radius 10 centered at (0,0)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        double a = Math.pow(x1 - 0, 2) + (Math.pow(y1 - 0, 2));
        a = Math.pow(a, .5);
        if (a <= 10){
            System.out.println("Point (" + x1 + ", " + y1 + ") is in the circle");
        }
        else {
            System.out.println("Point (" + x1 + ", " + y1 + ") is not in the circle");
        }
    }
}
