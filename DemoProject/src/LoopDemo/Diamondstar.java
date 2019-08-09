package LoopDemo;

public class Diamondstar {
	String a="*";
	public void dmd()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
				for(int k=1;k<=i*2-1;k++)
				{
					System.out.print(a);
				}
					System.out.println();
		}
					for(int i=3;i>=1;i--)
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
		Diamondstar dm=new Diamondstar();
		dm.dmd();
	}

}
