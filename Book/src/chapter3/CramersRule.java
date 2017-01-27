/*
 */
package chapter3;

import java.util.Scanner;

/**
 *
 * @author Poddo
 */
public class CramersRule {
    public static void main(String[] args){
        System.out.println("Enter a, b, c, d, e, and f: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double det = ((a * d) - (b * c));
        
        if (det == 0){
            System.out.println("The equation has no solution");
        }
        else{
            double x = ((e * d) - (b * f)) / det;
            double y = ((a * f) - (e * c)) / det;
            System.out.println("X = " + x + " and Y = " + y);
        }       
    
}
}
