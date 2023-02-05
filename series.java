import java.util.*;
import java.lang.*;
import java.io.*;
  class series1 {
	void findNthterm(int n)
	{
	if(n%2==0)	
	{
		n=n/2;
		System.out.println(Math.pow(3,n-1)+"\n");
	}
	else 
	{
		n=(n/2)+1;
		System.out.println(Math.pow(2, n-1)+"\n");
	}	
	}
	}
    public class series 
    {
    public static void main(String[] args)
    {
		series1 s=new series1();
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		s.findNthterm(n);
   
	}
    }
    


