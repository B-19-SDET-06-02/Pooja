package ArrayDemo;

public class Smallnoary {
	int a[]= {88,56,23,97,16,4};
	public void sml()
	{
		System.out.println("The smallest number is");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<a.length)
			{
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smallnoary sm=new Smallnoary();
		sm.sml();

	}

}
