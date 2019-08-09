package LoopDemo;

public class Star {
		String a="*";
		public void str()
		{
			for(int row=1;row<=5;row++)
			{
				for(int col=1;col<=row;col++)
				{
					System.out.print(a);
				}
					System.out.println();
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star st=new Star();
		st.str();
	}

}
