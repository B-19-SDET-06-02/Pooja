package ArrayDemo;
import java.util.Scanner;
public class Ascsort {
	int[] a= new int[5];
	int temp;
	Scanner sc=new Scanner(System.in);
	public void asc()
	{
		System.out.println("Enter Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]> a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ascsort ac=new Ascsort();
		ac.asc();

	}

}
