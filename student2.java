import java.util.Scanner;
public class student2 {
	String name;
	int age;
	int USN;    
	void read() 
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the Name");
    	    name=sc.next();
    		System.out.println("Enter The USN");
    		USN=sc.nextInt();
    		System.out.println("Enter The AGE");
    	    age=sc.nextInt();
    }
	void display() {
		System.out.println("Name is: "+ name);
		System.out.println("age is: "+ age);
		System.out.println("USN is: "+ USN);
	}
	public static void main(String[] args) {
          student2 S=new student2();
          S.read();
	      S.display();
}
}

