package ArrayDemo;

public class Evensrchary {
	int[] a={5,8,3,9,14,16,18};
	int temp;
	public void evn()
	{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]%2 == 0)
				{
					System.out.println(a[j]);
				}
					
			}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evensrchary ev=new Evensrchary();
		ev.evn();

	}

}
