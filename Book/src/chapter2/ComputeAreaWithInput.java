/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;
import java.util.Scanner;

/**
 *
 * @author bpodgorski
 */
public class ComputeAreaWithInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number for the radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * 3.14159;
        //display result
        System.out.println("The area of a circle with radius " + radius + " is " + area);
        
    }
    
}
