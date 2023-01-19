class valuefind {
  public static void main(String[] args) 
  {
    int[] num = {24,5,3,2,4,45,78};
    int toFind = 5;
    int x=0;
    for (int i=0;i<num.length;i++)
    {
    if (toFind== num[i]) 
    {
        //System.out.println("toFind: " + num[i]+ " at position: " +i+1);
        //x++;
        break;
    }
    if(found)
      System.out.println(toFind + " is found." + num[i]+ " at position: " +i+1);
    else
      System.out.println(toFind + " is not found.");
    }
 }
}