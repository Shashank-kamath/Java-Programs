import java.util.Scanner;
public class Ascending {

	public static void main(String[] args) {
		
		int arr[]=new int[10];
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements");
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array entered is :");
		for( i=0;i<10;i++)
		{
		System.out.print(arr[i]);
	    System.out.print(" ");
		}
		System.out.println(" ");
		for(i=0;i<10;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
				    arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array is:");
		for( i=0;i<10;i++)
			{
				System.out.print(arr[i]);
				System.out.print(" ");
			}
	}
}