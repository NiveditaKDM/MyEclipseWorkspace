import java.util.Scanner;
public class AdditionOfDigit {
public static void main(String[] args) {
	System.out.println("Enter the no to which digits to be added");
	Scanner sc=new Scanner(System.in);
	
long 	n=sc.nextInt();
long sum=0;
long t=0;
	while(n>0) {
		t=n%10;
		sum=sum+t;
		
		//System.out.println(sum+"\t"+t+"\t"+n);
		n=n/10;
	}
System.out.println(sum);
long s=0,t1;
if(sum>9) {
	while(sum>0) {
 t1=sum%10;
		 s=s+t1;
		sum=sum/10;
}
System.out.println(s);	
}
else
{
	System.out.println(sum+"no is single digit so cant add its digits");
}
}
}