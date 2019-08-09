package LoopDemo;

public class CountDigit {
	long contno=7837488919l;
	long a[]=new long[10];
	public void cdt()
	{
		
		for(int i=0;i<=a.length;i++)
		{
			
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j] && (i!=j))
				{
					System.out.println(a[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDigit oo=new CountDigit();
		oo.cdt();

	}

}
