/*
 */
package chapter3;

/**
 *
 * @author Poddo
 */
public class RandomMonth {
    public static void main(String[] args){
       int month = (int)(Math.random() * 12);
       switch (month){
           case 0: System.out.println("Jan");break;
           case 1: System.out.println("Feb");break;
           case 2: System.out.println("Mar");break;
           case 3: System.out.println("Apr");break;
           case 4: System.out.println("May");break;
           case 5: System.out.println("Jun");break;
           case 6: System.out.println("Jul");break;
           case 7: System.out.println("Aug");break;
           case 8: System.out.println("Sep");break;
           case 9: System.out.println("Oct");break;
           case 10: System.out.println("Nov");break;
           case 11: System.out.println("Dec");break;
       }
    }
    
}
