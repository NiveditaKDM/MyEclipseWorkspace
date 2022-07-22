import java.util.Scanner;

public class FibonacciNo {
public static void main(String[] args) {
	int f=0;
	int next=1;
	int sum=0;
	System.out.println("Enter the number to which fibonacci series to be displayed");
	Scanner sc=new Scanner(System.in);
	int No=sc.nextInt();
	for(int i=1;i<=No;i++) {
		System.out.print(f+" ");
		sum=f+next;
		f=next;
		next=sum;
		
		
	}
			
			sc.close();	
}

}
