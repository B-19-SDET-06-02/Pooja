package LoopDemo;

public class PrimSeries {
		int a,b,c;
		public void psri()
		{
			for(a=2;a<=100;a++)
			{
				c=0;
			
				for(b=2;b<=a/2;b++)
				{
					if(a%b ==0)
					{
						c=1;
						break;
					}
				}
					if(c==0)
						System.out.println(a+ " ");
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimSeries pr=new PrimSeries();
		pr.psri();
		
	}

}
