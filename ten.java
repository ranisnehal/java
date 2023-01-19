import java.util.*;
import java.lang.*;
import java.io.*;
 
 
public class ten
{
    public static void main (String[] args)
    {
        int i,j,k,rows;
        Scanner my_scanner = new Scanner(System.in);
 
        System.out.println("Enter the number of rows to print symbol * =");
        rows = my_scanner.nextInt();
 
 
 
   for (i = 1; i <= rows; i++) {
      for (j=rows-i; j>=1; j--)
            {
              
                System.out.print(" ");
            }
    
    for (k=1; k<=i; k++ )
            {
               
                System.out.print("* ");
            }

      System.out.println();
    }
    }
}