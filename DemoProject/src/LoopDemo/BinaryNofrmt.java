package LoopDemo;

public class BinaryNofrmt {
	//int a=1;
	public void bin()
	{
		for(int row=0;row<=4;row++)
		{
			for(int col=0;col<=row;col++)
			{
				if(col % 2
						== 0)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryNofrmt bn=new BinaryNofrmt();
		bn.bin();

	}

}
