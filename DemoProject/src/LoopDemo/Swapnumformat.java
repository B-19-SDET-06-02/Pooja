package LoopDemo;

public class Swapnumformat {
	int c;
	public void num()
	{
		for(int row=1;row<=5;row++)
		{
			int a=0;
			int b=1;
			for(int col=1;col<=row;col++)
			{
				c=a+b;
				System.out.print(c+ "");
				a=b;
				b=c;
			}
				System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapnumformat nm=new Swapnumformat();
		nm.num();
	}

}
