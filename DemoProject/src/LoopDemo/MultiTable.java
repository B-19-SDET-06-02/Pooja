package LoopDemo;

public class MultiTable {
	int a=8,c;
	public void mtb()
	{
		for(int b=1;b<=10;b++)
		{
			c=a*b;
			System.out.println(a+"*"+(b)+"="+c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiTable mt=new MultiTable();
		mt.mtb();

	}

}
