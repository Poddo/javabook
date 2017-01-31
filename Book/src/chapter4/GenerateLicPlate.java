/*
 */
package chapter4;

/**
 *
 * @author bpodgorski
 */
public class GenerateLicPlate {
    public static void main(String[] args){
        char letter1 = (char)((int)'A'+Math.random()*((int)'Z'-(int)'A'+1));
        char letter2 = (char)((int)'A'+Math.random()*((int)'Z'-(int)'A'+1));
        char letter3 = (char)((int)'A'+Math.random()*((int)'Z'-(int)'A'+1));
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);
        int number4 = (int)(Math.random() * 10);
        System.out.print("" + letter1 + letter2 + letter3 + number1 + number2 + number3 + number4);
    }
}
