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
public class SumDigits {
    public static void main(String[] args){
        int a;
        int result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer 0 - 999: ");
        a = input.nextInt();
        result = a % 10;
        a = a / 10;
        result += a % 10;
        a = a / 10;
        result += a% 10;
        System.out.println("The sum is " + result);
                
    }
    
}
