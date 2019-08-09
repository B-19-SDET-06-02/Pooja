package LoopDemo;

public class PrimeNo {
	int a=19,c=0;
	public void pri()
	{
		for(int b=2;b<19/2;b++)
		{
			if(a%b==0)
			{
				c=c+1;
				//System.out.println("Number is prime");
			}
		}
		if(c==0)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not prime");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNo pr=new PrimeNo();
		pr.pri();
	}

}
