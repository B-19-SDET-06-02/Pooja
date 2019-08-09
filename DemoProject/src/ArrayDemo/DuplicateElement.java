package ArrayDemo;

public class DuplicateElement {
	int a[]= {3,5,7,9,5,4,2,4,1,10,9};
	public void dpe()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j]) && (i!=j))
				{
					System.out.println(a[j]);
					System.out.println("Position of original value is:"+(i+0));
					System.out.println("Position of duplicate value is:"+(j+0));
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateElement dp=new DuplicateElement();
		dp.dpe();
	}

}
