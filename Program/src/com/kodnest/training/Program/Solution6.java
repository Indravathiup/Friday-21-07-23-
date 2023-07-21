package com.kodnest.training.Program;

import java.util.Scanner;

public class Solution6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to print even and divisible by 3");
		int n=scan.nextInt();
		evendivisibleby3(n);
	}	
public static void evendivisibleby3(int n)
{
	for(int i=1;i<n;i++)
	{
		if(i%2==0)
		{
			if(i%3==0)
			{
		
			System.out.println(i);
		}
		}
	}
}
}
