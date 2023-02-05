import java.util.*;

class Hillstation{
	String location,Famousfor;
	String Dishes;
}
class Manali extends Hillstation{
	void display() {
		
		location="HIMACHAL PRADESH";
		Famousfor="SNOW,TEMPLES,CAVES";
		Dishes="ROTI,CHAPATI";
		System.out.println("LOCATION: "+location);
		System.out.println("FAMOUS FOR :"+Famousfor);
		System.out.println("DISHES :"+Dishes);
		}
}
class Musoori extends Manali{
	void show() {
		location="UTTARAKHAND";
		Famousfor="MOUNTAINS,HILLS,FALLS ETC";
		Dishes="PAROTA,RICE";
		System.out.println("LOCATION: "+location);
		System.out.println("FAMOUS FOR :"+Famousfor);
		System.out.println("DISHES :"+Dishes);
		}
}
class Gulmarga extends Musoori{
	void print() {
		location="JAMMU AND KASHMIR";
		Famousfor="TEMPLES,MOUNTAINS,ZOO";
		Dishes="APPLE,ROTI,RICE";
		System.out.println("LOCATION: "+location);
		System.out.println("FAMOUS FOR :"+Famousfor);
		System.out.println("DISHES :"+Dishes);
	}
	
}
public class Chef {

	public static void main(String[] args) {
	         int n;
	         Gulmarga obj=new Gulmarga();
	         Scanner sc=new Scanner(System.in);
	         System.out.println("1. Manali:");
	         System.out.println("2. Musoori:");
	         System.out.println("3. Gulmarga:");
	         System.out.println("enter the destination number");
	         n=sc.nextInt();
	         switch(n)
	         {
	         case 1: obj.display();
	         break;
	         case 2: obj.show();
	         break;
	         case 3: obj.print();
	         break;
	         default: System.out.println("Invalid!!");
	         break;
	         }
 
	   }
}
