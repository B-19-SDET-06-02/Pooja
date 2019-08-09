package LoopDemo;

public class Diamondtest {
	String a="*";
	public void dmt()
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
				for(int k=1;k<=i*2-1;k++)
				{
					System.out.print("*");
				}
					System.out.println();
		}
			for(int i=4;i>=0;i--)
			{
				for(int j=3;j>=i;j--)
				{
					System.out.print(" ");
				}
					for(int k=1;k<=i*2-1;k++)
					{
						System.out.print("*");
					}
					System.out.println();
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diamondtest dm=new Diamondtest();
		dm.dmt();

	}

}
