public class two{
public static void main(String[] args){
 byte numberofseats =7;
 byte numberofdoors=4;
 byte emissions=3;
 byte numberofowners= 6;

 short power =362;
 short horsepower =496;
 
 int price=23500;
 int milage=50;

 long chesisnumber=12345678L;
 long registrationnumber=1234678L;

 float fuelconsumptions =15.6f;

 double carbonemition =23.456767;

 boolean  isdamaged = true;

 char   energyeff='a';

 int y= numberofdoors;
/*type casting*/
int x=(int)registrationnumber;
int b=(int)fuelconsumptions;

/*int k=(int)is damaged = will give error as boolean cannot be converted to int */

System.out.println("Its old car and details are as follows...");
System.out.println("price :" +price);
System.out.println("power :" +horsepower);
System.out.println("number of owners :" +numberofowners);
System.out.println("registration number :" +registrationnumber);
System.out.println("number of seats:" +numberofseats);
System.out.println("The car is damaged :" +isdamaged);

byte newpower=(byte)power;
System.out.println("newpower :" +newpower);






 

 
}
}