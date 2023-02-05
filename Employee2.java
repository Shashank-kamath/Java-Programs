import java.util.Scanner;
public class Employee2 {
	int n=10;
	int emp_id[];
	String emp_name[], emp_ph[];
	float emp_salary[];
	
	Scanner Sc=new Scanner(System.in);
	Employee2(int n){
		this.n=n;
		emp_id=new int[n];
		emp_name=new String[n];
		emp_ph=new String[n];
		emp_salary=new float[n];
	}
	void getdetails()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the " +(i+1)+ " employee id");
			emp_id[i] =Sc.nextInt();
			System.out.println("enter the " +(i+1)+ " employee name");
			emp_name[i] =Sc.next();
			System.out.println("enter the " +(i+1)+ " employee salary");
			emp_salary[i] =Sc.nextFloat();
			System.out.println("enter the " +(i+1)+ " employee phone no");		
	        emp_ph[i] =Sc.next();
		}
	}
	void showdetails()
	{
		System.out.println("employee id	| employee name	| employee salary	| employee phone number");
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println(+emp_id[i]+"		|" +emp_name[i]+"		|" +emp_salary[i]+"		|" +emp_ph[i]+"		");
	    }
	}
	
	public static void main(String[] args) {
	
		 int n=10;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number of employees");
		 n=sc.nextInt();
		 Employee2 emp=new Employee2(n);
		 emp.getdetails();
		 emp.showdetails();
	}
}