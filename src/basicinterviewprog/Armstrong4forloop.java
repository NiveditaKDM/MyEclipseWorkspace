package com.basicinterviewprog;
import java.util.Scanner;
import java.math.*;
public class Armstrong4forloop {
public static void main(String[] args) {
	System.out.println("Enet the no");
	Scanner S=new Scanner(System.in);
    int n=S.nextInt();
    int temp=n;
    int l=0;
    int rem=0;
    int sum=0;
    int a=0;
    for (;temp != 0; temp /= 10, ++a);

    temp = n;

    for (;temp != 0; temp /= 10)
    {
        rem = temp % 10;
        sum += Math.pow(rem, a);
    }

    
    System.out.println(sum);
	
if(n==sum) 
	System.out.println(n+"= is Armstrong");
	else
		System.out.println(n+"=Number is not Armstrong");
}
}
