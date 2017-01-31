/*
 */
package chapter4;

import static java.lang.Character.isLetter;
import static java.lang.Character.toLowerCase;
import java.util.Scanner;

/**
 *
 * @author bpodgorski
 */
public class IsVowel {
    public static void main(String[] args){
        System.out.println("Enter a letter: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char c = s.charAt(0);
        char lowerC = toLowerCase(c);
        if (isLetter(lowerC)){
            if (lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u'){
                System.out.println(c + " is a vowel");
            }
            else
                System.out.println(c + " is a consonant");
        }
        else{
            System.out.println("Invalid entry.");
        }
    }
    
}
