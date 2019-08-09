package ArrayDemo;

import java.util.Scanner;

public class Sizeofarray {
	int a[];
	int size;
	Scanner sc=new Scanner(System.in);
	public void siz()
	{ 
		
		System.out.println("Enter array size");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<size;j++)
		{
			System.out.println(a[j]);
		}
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sizeofarray sz=new Sizeofarray();
		sz.siz();
		

	}

}
