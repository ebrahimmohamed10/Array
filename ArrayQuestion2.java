package arrayquestion2;

import java.util.Scanner;
public class ArrayQuestion2 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

    
   
    }
 public static  int countArray(int a[])
{
    int size = 0;
    while(a[size] != 0)
    {
        size++;
    }
   System.out.println("number of array elements are  " + size);
   return size;
}
    
}
