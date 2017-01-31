/*
 */
package chapter4;

import java.util.Scanner;

/**
 *
 * @author bpodgorski
 */
public class MajorAndStatus {
    public static void main(String[] args){
        System.out.println("Enter 2 characters for Major and Status:");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        char majorChar = inputString.charAt(0);
        char yearChar = inputString.charAt(1);
        
        String major = "";
        String year = "";
        switch (majorChar){
            case 'M': major = "Mathematics";break;
            case 'C': major = "Computer Science";break;
            case 'I': major = "Information Technology";break;
            default: major = "Invalid";break;
        }
        switch (yearChar){
            case '1': year = "Freshman";break;
            case '2': year = "Sophomore";break;
            case '3': year = "Junior";break;
            case '4': year = "Senior";break;
            default: year = "Invalid";break;
        }
        if (major.equals("Invalid") || year.equals("Invalid")){
            System.out.println("Invalid Input");
        }
        else
            System.out.println(major + " " + year);
    }
}
