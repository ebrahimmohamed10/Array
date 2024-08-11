
package arrayquestion6;

import java.util.Scanner;

public class ArrayQuestion6 {

    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       int number[],size,countOccurrences=0;
       System.out.println("Enter size");
       size = input.nextInt();
       number = new int[size];
       System.out.println("Enter elements of array");
        for (int i = 0; i < number.length; i++) {
           number[i]= input.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
           if(2==number[i])
               countOccurrences++;
            
        }
        System.out.println("result = " + countOccurrences);
    }
    
}
