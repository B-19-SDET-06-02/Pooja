package StringDemo;

import java.util.Scanner;

public class Palindromestring {
	Scanner sc=new Scanner(System.in);
	public void palin()
	{
		System.out.println("Enter String input");
		String name=sc.next();
		int count=name.length();
		String rev="";
		for(int i=count-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		if(rev.equals(name))
		{
			System.out.println("Given name is palindrome");
		}
		else
		{
			System.out.println("Given name is not palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindromestring pl=new Palindromestring();
		pl.palin();
	}

}
