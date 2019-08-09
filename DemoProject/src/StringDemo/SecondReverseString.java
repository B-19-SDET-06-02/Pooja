package StringDemo;

public class SecondReverseString {
	String fullname="Pooja Garg";
	String rev="";
	public void scr()
	{
		int count=fullname.length();
		for(int i=count-1;i>=0;i--)
		{
			rev=rev+fullname.charAt(i);
		}
		System.out.print(rev);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondReverseString oo=new SecondReverseString();
		oo.scr();
		

	}

}
