package LoopDemo;

public class Numformat {
	int a=1;
	public void num()
	{
		for(int row=0;row<=4;row++)
		{
			for(int col=0;col<=row;col++)
			{
				System.out.print((a+col) + " ");
			}
				System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numformat nm=new Numformat();
		nm.num();
	}

}
