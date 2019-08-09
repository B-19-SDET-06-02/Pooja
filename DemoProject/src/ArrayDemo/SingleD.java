package ArrayDemo;
import java.util.Scanner;
public class SingleD {
	int[] Rollno= new int[5];
	String[] Name=new String[5];
	int[] Eng=new int[5];
	int[] Hindi=new int[5];
	int[] total=new int[5];
	float[] avg=new float[5];
	double[] per=new double[5];
	
	Scanner sc=new Scanner(System.in);
	public void ary()
	{
		System.out.println("Enter elements");
		for(int count=0;count<5;count++)
		{
			Rollno[count]=sc.nextInt();
			Name[count]=sc.next();
			Eng[count]=sc.nextInt();
			Hindi[count]=sc.nextInt();
			total[count]=Eng[count]+Hindi[count];
			avg[count]=total[count]/2;
			per[count]=total[count]/200;
			
		}
		System.out.println("Rollno\t Name\t Eng\t Hindi\t total\t avg\t per\n");
		for(int n=0;n<5;n++)
		{
		
			System.out.print(Rollno[n]);
			System.out.print("\t");
			System.out.print(Name[n]);
			System.out.print("\t");
			System.out.print(Eng[n]);
			System.out.print("\t");
			System.out.print(Hindi[n]);
			System.out.print("\t");
			System.out.print(total[n]);
			System.out.print("\t");
			System.out.print(avg[n]);
			System.out.print("\t");
			System.out.print(per[n]);
			System.out.print("\t");
			System.out.println();
		}
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleD oo=new SingleD();
		oo.ary();

	}

}
