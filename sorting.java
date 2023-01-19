public class sorting
{
public static void main(String[] args) 
{
    int[] arr = new int[] { 5, 4, 3, 8, 32, 76,44,56 };
   
    for (int i = 0; i < arr.length; i++) 
    {     
        for (int j = i + 1; j < arr.length; j++) 
        {  
            int temp = 0;  
            if(arr[i]>arr[j])                         
            {          
                temp = arr[i];              
                arr[i] = arr[j];            
                arr[j] = temp;
            }
        }
    }
           

           for (int i = 0; i < arr.length; i++) 
           {     
              System.out.println(arr[ i ]);  
           }
}
}