package com.kodnest.training.Program;

import java.util.Scanner;

public class Solution5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to divisible by 5 and 2");
		int n=scan.nextInt();
		divisibleby5and2(n);
	}	
public static void divisibleby5and2(int n)
{
	for(int i=1;i<n;i++)
	{
		if(i%5==0)
		{
			System.out.println(i);
		}

}
}
}
