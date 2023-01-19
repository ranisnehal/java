class table{
public static void main( String args[]){

int[] nums={2 , 3, 5 ,7};
for(int i=0;i<=nums.length;i++)
table(nums[i]);
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