package com.basicinterviewprog;
import java.util.Scanner;

public class PalindromNo {
	public static void main(String[] args) {
		int rev=0;
		System.out.println("Enter the no ");
		Scanner SC= new Scanner(System.in);
		int n=SC.nextInt();
		int org=n;
		while(n>0) {
			int no=n%10;
			rev=(rev*10)+no;
			n=n/10;
			 		}
		System.out.println("Reverse no is"+rev);
		if (org==rev) 
			System.out.println(rev+"Palindrom");
			else
				System.out.println(rev+"Not palindrom");
		}
	}


