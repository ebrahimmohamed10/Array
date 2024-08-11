
package arrayquestion5;

import java.util.Scanner;


public class ArrayQuestion5 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int number[],size,countOccurrences;
       System.out.println("Enter size");
       size = input.nextInt();
       number = new int[size];
       System.out.println("Enter elements of array");
        for (int i = 0; i < number.length; i++) {
           number[i]= input.nextInt();
            
        }
        
        
    }
   
    
}
