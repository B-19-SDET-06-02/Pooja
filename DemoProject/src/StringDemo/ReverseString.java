package StringDemo;

public class ReverseString {
	String name="Pooja";
	String rev="";
	public void check()
	{
		int count=name.length();
		for(int i=count-1;i>=0;i--)
		{
			rev+=name.charAt(i);
			
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rv=new ReverseString();
		rv.check();
	}

}
