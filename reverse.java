import java.util.*;
public class reverse{
    public static void main(String[] args){
        int[] arr = {24,5,3,2,4};
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
           System.out.println();
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+":");
        }
    }
}