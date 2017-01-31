/*
 */
package chapter3;

import java.util.Scanner;

/**
 *
 * @author bpodgorski
 */
public class OverlappingCircles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter circle1's center (x,y) and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        
        System.out.println("Enter circle2's center (x,y) and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();
        
        double distance = Math.pow(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)), .5);
        
        if (distance <= Math.abs(r1 - r2)){
            System.out.println("Circle 2 is inside Circle 1");
        }
        else if (distance <= r1 + r2){
            System.out.println("Circle 2 overlaps Circle 1");
        }
        else
            System.out.println("Circle 2 does not overlap Circle 1");
    }
}
