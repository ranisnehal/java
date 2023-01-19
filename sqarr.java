import java.util.*;
public class sqarr{
   public static void main(String[] args){
    int[] arr =new int[10];
    int[] squares = new int[arr.length];

    Scanner sc= new Scanner(System.in);
    System.out.println("enter the numbers in original array");
    for(int i=0;i<arr.length;i++)
     {
        arr[i]=sc.nextInt();
     }
     System.out.println(" original elements of the array ");

     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
     }

     for(int i=0;i<squares.length;i++){
        squares[i]= arr[i]*arr[i];
     }

     System.out.println(" after squaring the elements of original array");
     for(int i=0;i<arr.length;i++)
     {
        System.out.print(squares[i]+ " ");
     }
     
   }
}