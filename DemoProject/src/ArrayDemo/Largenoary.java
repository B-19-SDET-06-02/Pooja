package ArrayDemo;
import java.util.Scanner;
public class Largenoary {
	int[] a=new int[5];
	Scanner sc=new Scanner(System.in);
		public void grt()
		{
			System.out.println("Enter array elements");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<a.length;i++)
			{
				if(a[i]> a.length)
				{
					System.out.println(a[i]);
				}
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largenoary lr=new Largenoary();
		lr.grt();

	}

}
