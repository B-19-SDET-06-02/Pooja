package StringDemo;

public class VowelString {
	String name="He is Stupidfoolish nonsenseboy";
	int count=0,count1=0,count2=0,count3=0,count4=0;
	public void vwl()
	{
	for(int i=name.length()-1;i>=0;i--)
	{
		char ch = name.charAt(i);
		if(ch=='a')
		{
			count++;
		}
		if(ch=='o')
		{
				count1++;
		}
		if(ch=='u')
		{
			count2++;
		}
		if(ch=='i')
		{
			count3++;
		}
		if(ch=='e')
		{
			count4++;
		}
			
	}
	System.out.println("Count of a is:"+count);	
	System.out.println("Count of o is:"+count1);
	System.out.println("Count of u is:"+count2);
	System.out.println("Count of i is:"+count3);
	System.out.println("Count of e is:"+count4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelString vw=new VowelString();
		vw.vwl();

	}

}
