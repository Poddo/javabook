/*
 */
package chapter4;

import java.util.Scanner;

/**
 *
 * @author bpodgorski
 */
public class AsciiCode {
    public static void main(String[] args){
        System.out.println("Enter an ASCII code 0 through 127");
        Scanner input = new Scanner(System.in);
        int intAscii = input.nextInt();
        System.out.println((char)intAscii);
        
    }
    
}
