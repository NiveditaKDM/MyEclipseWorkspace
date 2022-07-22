import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
	System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n==1||n==0) {
	System.out.println(n+" "+"Number is  natural number");
}
else if(n%2==0)
{
	System.out.println(n+" "+"Number is even");
}
else
System.out.println(n+" "+ "Number is odd");
}

}
