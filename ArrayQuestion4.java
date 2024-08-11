
package arrayquestion4;

import java.util.Scanner;

public class ArrayQuestion4 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int number[],size,minimumnumber;
       System.out.println("Enter size");
       size = input.nextInt();
       number = new int[size];
       System.out.println("Enter elements of array");
        for (int i = 0; i < number.length; i++) {
             number[i]= input.nextInt();
            
        }
        minimumnumber = number[0];
        for (int i = 1; i < number.length; i++) {
            if(minimumnumber>number[i])
               minimumnumber = number[i];
            
        }
        System.out.println("maximumnumber = " + minimumnumber);
    }
    
}
