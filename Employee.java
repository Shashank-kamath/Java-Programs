import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		
		float arr[]=new float[20];
		int i,j,n=10;
		float temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary of employees");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextFloat();
		}
		System.out.println("Salary Entered is :");
		for( float ele : arr)
		{
		System.out.print(ele);
		}
		System.out.print("\nEmployee Salary in Ascending order:");
		System.out.println(" ");
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
				    arr[j]=temp;
				}
			}
		}
		for(i=n-1;i>=0;i--)
	    {
	    	System.out.print(arr[i]);
	    }
		System.out.println("\nEmployee Salary in Descending order:");
		for(float ele: arr)
	    {
	    	System.out.print(ele);
	    }
	    	System.out.println("");
	    	int count=0;
	    	j=0;
	    	i=0;
	    	while(i<n)
	    	{
	    		count=0;
	    		while((count<i)&&j<n)
	    		{
	    			System.out.print(arr [j]);
	    	    	System.out.print("");
	    	    	j=j+1;
	    	    	count=count+1;
	    		}
	        System.out.println("");
	        i=i+1;
	        System.out.println("");
	    	}
	   }
}



