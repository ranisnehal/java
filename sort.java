
public class sorting
{
public static void main(String[] args) 
{
    swap(40,50);
}
static void swap(int a,int b){
    int tmp;
    System.out.println("the values to be swapped are:");
    System.out.println("A:"+a);
    System.out.println("B:"+b);

    tmp=a;
    a=b;
    b=tmp;
    System.out.println("the swapped values are : ");
    System.out.println("A:"+a);
    System.out.println("B:"+b);

}
}