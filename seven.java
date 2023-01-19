class seven{
public static void main( String args[]){

System.out.println("Table of 4");
 table(4);

System.out.println("Table of 7");
 table(7);

System.out.println("Table of 12");
table (12);
}

static void table(int y)
{

for(int i=1;i<=10;i++)
{
int x=y*i;
System.out.println(x);
}
}
}