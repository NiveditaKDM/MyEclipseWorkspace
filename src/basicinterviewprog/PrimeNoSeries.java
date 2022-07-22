package com.basicinterviewprog;

import java.util.Scanner;

public class PrimeNoSeries {
	public static void main(String[] args) {
		int e;
		String pn="";
		int num=0;
		int c=0;
		System.out.println("Enter the no of of series");
		Scanner sc=new Scanner(System.in);
		e=sc.nextInt();

		for (int i = 1; i <=e; i++) {
			 c=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					c=c+1;
				}
			}
			if(c==2) {
				pn=pn+i+" ";
			}
			}
		
		System.out.println(" Prime numbers from 1 t n are");
		System.out.println(pn);
	}

}
