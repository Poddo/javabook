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
public class WindChill {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double temp;
        double windspeed;
        double windchill;
        double v16;
        
        //get input
        System.out.println("Please enter temperature in Fahrenheit between -58 and 41: ");
        temp = input.nextDouble();
        System.out.println("Please enter windspeed in mph (greater than 2): ");
        windspeed = input.nextDouble();
        //calculate windchill
        v16 = Math.pow(windspeed, .16);
        
        windchill = 35.74 + (.6215 * temp) - (35.75 * v16) + (.4275 * temp * v16);
        
        System.out.println("The windchill is: " + windchill);
        
    }
    
}
