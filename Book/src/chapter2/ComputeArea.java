/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

/**
 *
 * @author bpodgorski
 */
public class ComputeArea {
    public static void main(String[] args){
        double radius;
        double area;
        
        //set radius
        radius = 20;
        //compute area
        area = radius * radius * 3.14159;
        //display result
        System.out.println("The area of a circle with radius " + radius + " is " + area);
        
    }
    
}
