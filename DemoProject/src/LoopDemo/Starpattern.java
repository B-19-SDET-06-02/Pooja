package LoopDemo;

public class Starpattern {
	String a="*";
	public void str()
	{
		for(int i=0;i<=5;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(a);
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Starpattern st=new Starpattern();
		st.str();
	}

}
