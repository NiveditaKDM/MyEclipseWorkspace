package com.basicinterviewprog;
import java.util.Scanner;
import java.math.*;


public class ArmstrongNo {
	public static void main(String[] args) {
		System.out.println("enter the no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int org=n;
		int temp=n;
		int count=0;
		int a=0;
		int l=0;
		//System.out.println("enter the no");
		//sc.close();
		while(temp>0) {
			temp=temp/10;
			//System.out.print("digit is"+temp+""+count);
			count++;
		}
		temp=n;
		System.out.println(temp+""+ count);
		while(temp>0) {
			l=temp%10;
			a=(int)(a+Math.pow(l, count));
			//System.out.println(a);
			temp=temp/10;
			System.out.println(l);
		}
		System.out.println(a);
		if(n==a) {
			System.out.println(temp+"Armstrong");
		}
		else
			System.out.println(temp+"not Armstrong");
		}
	}


