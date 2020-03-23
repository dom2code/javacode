package javaApps.programs;

import java.util.Scanner;

public class stringsPractice {
	
	
	
	public void reverseString()
	{
		String s = "dominic";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}
	
	public void userStringReverse(String text)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse : ");
		sc.next(text);
		StringBuffer sb = new StringBuffer(text);
		System.out.println(sb.reverse());
		
		
	}
	
	
	
	
	public static void main (String args[])
	{
		
		stringsPractice obj = new stringsPractice();
		//obj.reverseString();
		obj.userStringReverse("dom");
		
		
		
	}

}
