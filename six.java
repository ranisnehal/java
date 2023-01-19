public class six{
public static void main(String[] args){
sayhello();
sum(5,7);
compare();
int x=square(5);
System.out.println(x);

}
static void sayhello(){
System.out.println("hi there");
}

static void sum(int a,int b){

int num1 =a;
int num2 =b;
int summ=num1+num2;
System.out.println(summ);

}
static void compare(){
int x=12;
if(x<1 && x>13){
System.out.println("12 is greater");
}
else{
System.out.println("12 is smaller");}

}

static int square(int a){
int square= a*a;
return (square);
}
}