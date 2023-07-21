package com.kodnest.training.Program;

import java.util.Scanner;

public class Solution4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to divisible by 5 and 3");
		int n=scan.nextInt();
		divisibleby5and3(n);
	}	
public static void divisibleby5and3(int n)
{
	for(int i=1;i<n;i++)
	{
		if(i%5==0 && i%3==0)
		{
			System.out.println(i);
		}

}
}
}
