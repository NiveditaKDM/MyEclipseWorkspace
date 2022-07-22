package com.basicinterviewprog;

import java.util.Scanner;
public class Arm3digit {
public static void main(String[] args) {
	System.out.println("enter no");
	Scanner s=new Scanner (System.in);
	int n=s.nextInt();
	int temp,l,sum;
	temp=l=sum=0;
	temp=n;
	while(temp>0) {
		l=temp%10;
		sum=sum+(l*l*l);
		temp=temp/10;}
	System.out.println(sum);
	if(sum==n)
	System.out.println("Armstrong no");
else
	System.out.println("Not Armstrong No");
} }

