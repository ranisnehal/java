import java.util.*;

public class copy{
	public static void main(String args[]){
		int a[]={24,5,3,2,4};
		int b[]=new int[a.length];
		
		
		for(int i=0;i<a.length;++i){
			b[i]=a[i];
            System.out.print(b[i]+ " ");
		}
		
    }
}