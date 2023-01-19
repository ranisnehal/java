import java.util.*;
 
public class minimum{
 
  public static void main(String args[]) {
 
    int arr1[] =  {2,44,5,42,15,56};
    System.out.println("The smallest element in the array is: "+largestElement(arr1));
 
    
  }
  static int largestElement(int arr[]) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
}