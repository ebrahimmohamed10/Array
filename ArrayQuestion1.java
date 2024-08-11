
package arrayquestion1;

import java.util.Scanner;
public class ArrayQuestion1 {

   

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Enter size of the array:");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
            sum = sum arr[i];
        } +
        System.out.println("Sum of the array is:"+sum); 
    }
    
}
