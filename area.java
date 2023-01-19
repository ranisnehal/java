import java.util.*;

class area1{
    int length;
    int breadth;
    area1(int a, int b)
    {
         length = a;
         breadth = b;
    }
    public int setDim()
    {
        return length * breadth;
    }
}

public class area{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the lenght of Recatangle");
         a = obj.nextInt();
        //obj.nextLine();
        System.out.println("Enter the breadth of Recatangle");
       // b = obj.nextInt();
        area ob1 = new area1(a,b);
        System.out.println("Area = "+ ob1.setDim());
    }
}