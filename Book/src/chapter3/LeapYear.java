/*
 */
package chapter3;

import java.util.Scanner;

/**
 *
 * @author Poddo
 */
public class LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        
        //check if it is a leap year
        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        
        System.out.println("It is " + isLeapYear + " that " + year + " is a leap year.");
                
    }
    
}
