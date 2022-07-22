import java.util.Scanner;

public class FactorialNo {
public static void main(String[] args) {
	System.out.println("enter the no to find factorial ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int fact=1;
	for (int i=1;i<=n;i++) {
		
		fact*=i;

	}
System.out.println(fact);
}

}
