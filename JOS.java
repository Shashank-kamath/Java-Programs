import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class JOS{
	
	static void Josh (List<Integer> p, int k, int index)
	{
		if(p.size()==1) 
		{
			System.out.println(p.get(0));
		    return;
		}
	index =((index+k)%p.size());
	p.remove(index);
	Josh(p,k,index);
	}
	public static void main(String[] args) {
      
		int n,k;
		System.out.println("Enter role of n and k");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		k--;
		int index=0;
		List<Integer>p=new ArrayList<>();
		for(int i=1;i<=n;i++)
		{
			p.add(i);
		}
    Josh(p,k,index);
	}
}
