package com.kodnest.training.Program;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number divisible by 2");
		int n= scan.nextInt();
		divisibleby2(n);
	}
	public static void divisibleby2(int n)
	{
	for(int i=0;i<n;i++)
	{
		if(i%2==0)
		{
		System.out.println(i);
	}

}
}
}
