package LoopDemo;

public class numberfrmt {
	int a=1;
	public void num()
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(a);
			}
				a++;
				System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberfrmt nm=new numberfrmt();
		nm.num();
	}

}
