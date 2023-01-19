import java.util.Random;
import java.lang.*;
import java.io.*;
 
 
public class thirteen
{
    public static void main (String[] args){
        Random ran = new Random();
        int in = ran.nextInt(10) ;

        String[] sname={"aarav","khushi","aryan","sneha","kavya","saurav","dipesh","abhi","kirti","shubh"};
    
       System.out.print(sname[in]);
    }
}