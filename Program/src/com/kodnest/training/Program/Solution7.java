package com.kodnest.training.Program;

import java.util.Scanner;

public class Solution7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to print odd and divisible by 5");
		int n=scan.nextInt();
		odddivisibleby5(n);
	}	
public static void odddivisibleby5(int n)
{
	for(int i=1;i<n;i++)
	{
		if(i%2!=0)
		{
			if(i%5==0)
			{
		
			System.out.println(i);
		}
		}
	}
}
}


