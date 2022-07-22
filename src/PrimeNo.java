import java.util.Scanner;
public class PrimeNo {
public static void main(String[] args) {
	System.out.println("Enter the no");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int flag=0;
	if(n==0||n==1) 
		flag=1;
	for(int i=2;i<=n/2;++i) {
		if(n%i==0)
		flag= 1;
		break;
	}
	if(flag==0)
	{
		System.out.println(n+" "+"No is prime");
	}
		else
		{
			System.out.println(n+" "+"No is not prime");
	}
	
	
}
}
