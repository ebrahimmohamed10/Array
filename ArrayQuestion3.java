
package arrayquestion3;

import java.util.Scanner;

public class ArrayQuestion3 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int number[],size,maximumnumber;
       System.out.println("Enter size");
       size = input.nextInt();
       number = new int[size];
       System.out.println("Enter elements of array");
        for (int i = 0; i < number.length; i++) {
             number[i]= input.nextInt();
            
        }
        maximumnumber = number[0];
        for (int i = 1; i < number.length; i++) {
            if(maximumnumber<number[i])
                maximumnumber = number[i];
            
        }
        System.out.println("maximumnumber = " + maximumnumber);
    }
    
}
