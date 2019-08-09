package ArrayDemo;

public class UniqueElements {
	int a[]= {3,5,7,9,5,4,2,4,1,10,9};
	public void unq()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(((i!=j)&& a[i]==a[j]))
				{
					System.out.println(a[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueElements un=new UniqueElements();
		un.unq();
	}

}
