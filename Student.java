import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter The USN");
		int USN=sc.nextInt();
		System.out.println("Enter The AGE");
		int age=sc.nextInt();
	System.out.println("Name is: "+ name);
	System.out.println("age is: "+ age);
	System.out.println("USN is: "+ USN);
}
}
