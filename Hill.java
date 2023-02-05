import java.util.*;
class ABC{
	String location;
	String place;
	String food;
}
	class Manali extends ABC
	{
		
			
		void display() {
			location = "Manali";
			place = "ABC";
			food = "Biryani";
		
			System.out.println("Location :" +location+"\n"+"Place  :"+place+"\n"+"Food:"+food);
		}
		
	}
	class Mussoorie extends ABC
	{
		
			
		void display() {
			location = "Mussoorie";
			place = "LMN";
			food = "Paratta";
			System.out.println("Location :" +location+"\n"+"Place  :"+place+"\n"+"Food:"+food);
		}
	}
	class Gulmarg extends ABC
	{
		
		
		void display()
		{

			location = "Gulmarg";
			place = "XYZ";
			food = "Noodles";
			System.out.println("Location :" +location+"\n"+"Place  :"+place+"\n"+"Food:"+food);
		}
	}
	
public class Hill {
	public static void main(String[] args) {
		
		
		Manali k = new Manali();
		Mussoorie h = new Mussoorie();		
		Gulmarg g = new Gulmarg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Available Destinations: \n 1.Manali\n 2.Mussoorie\n 3.Gulmarg\nEnter your choice:\n");
		int n = sc.nextInt();
		
		switch(n)
		{
		case 1 : k.display();
	    break;
		case 2: h.display();
		break;
		case 3 : g.display();
		break;
		default : System.out.println("Invalid");		
		}
		
	}
}
