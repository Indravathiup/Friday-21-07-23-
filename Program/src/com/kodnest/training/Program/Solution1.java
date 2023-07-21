package com.kodnest.training.Program;

import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number divisble by 3");
		int n=scan.nextInt();
		divisibleby3(n);
		
	}
	public static void divisibleby3(int n)
	{
	for(int i=0;i<n;i++)
	{
		if(i%3==0)
		{
		System.out.println(i);


}
	}
	}
}
