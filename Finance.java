import java.util.Scanner;
public class Finance {

	public static void main(String[] args) {
		
		float ap,deposit;
		int i,m;
		Scanner Sc =new Scanner(System.in);
		System.out.println("enter the amount to be deposited:");
		deposit=Sc.nextFloat();
		System.out.println("enter the annual percentage:");
		ap=Sc.nextFloat();
		System.out.println("enter the maturity time:");
		m=Sc.nextInt();
		System.out.print("monthCD value is:\n");
		for(i=1;i<=m;i++)
		{
			deposit = deposit + deposit*(ap/1200);
			System.out.print("\n"+i);
			System.out.print("\t"+deposit);
		}
	}

}
