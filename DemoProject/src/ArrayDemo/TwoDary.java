package ArrayDemo;

import java.util.Scanner;

public class TwoDary {
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int c[][]=new int[3][3];
	Scanner sc=new Scanner(System.in);
	public void twd()
	{
		System.out.println("Enter elemnets of a");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
		
		System.out.println();
		}
		
		System.out.println("Enter elements of b");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(" "+b[i][j]);
			}
		
		System.out.println();
		}
		System.out.println("addition of two matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
	
		}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDary tw=new TwoDary();
		tw.twd();
	}

}
