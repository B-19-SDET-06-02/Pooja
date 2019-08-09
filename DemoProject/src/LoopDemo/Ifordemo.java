package LoopDemo;

public class Ifordemo {
	int x=0,y=0;
	public void dm()
	{
		for(int z=0;z<5;z++)
		{
			if((++x>2) && (++y>2))
			{
				x++;
			}
		}
			System.out.println(x+ " " +y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ifordemo oo=new Ifordemo();
		oo.dm();

	}

}
