import java.util.*;
public class eight{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your name :");
String name=sc.nextLine();
 greetings(name);

}

static void greetings(String name){
   System.out.println("Hello" + name);
   System.out.println(" Hope you are doing great!!!");
}
}
