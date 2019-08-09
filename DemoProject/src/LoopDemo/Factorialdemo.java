package LoopDemo;

public class Factorialdemo {
	int a=1;

	
public void fact()
{

	for(int i=5;i>=1;i--)
	{
	a=a*i;
		}
	System.out.println(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorialdemo fct=new Factorialdemo();
		
		fct.fact();
	}

}
