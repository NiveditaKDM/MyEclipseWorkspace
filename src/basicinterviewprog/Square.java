package com.basicinterviewprog;

import java.util.Iterator;
import java.util.Scanner;

public class Square {
	public static void main(String[] args) {	
//System.out.println("Eneter the no line");
//Scanner Sc=new Scanner(System.in);
//int rows=Sc.nextInt();
//int col=Sc.nextInt();

for (int i = 0; i <= 3; i++)
{
    for (int j = 0; j <= 3; j++)
    {
        if ((j == 0 || j == 3)||(i == 0 || i ==3) )  
        {
            System.out.print(" *");  
        }
        else
        {
            System.out.println("");
    }
   // System.out.println("");
}


}
}
}