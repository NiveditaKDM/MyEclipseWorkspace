import java.util.Scanner;

public class CountStringlengthFromString {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
	String S=sc.nextLine();
	System.out.println(S);
	String s[] =S.split("\\s");
	for (String string : s) {
		int c=string.length();
		System.out.println("Length of  string"+" "+string+"="+""+c);
		
	}
	}
}
