import java.util.*;
import java.lang.*;
import java.io.*;
 
 
public class eleven{
    public static void main( String[] args){
        int r,c,s=0;
        for(r=1;r<=4;r++)
        {
            for(c=1;c<=r;c++){
                s++;
                System.out.print( s );
                
            }
            System.out.println();
        }
    }
}