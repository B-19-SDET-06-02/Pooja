package StringDemo;

public class SplitReverseString {
	String str="Pooja Garg";
	String st1;
	String st[];
	String rev="";
	String rev1="";
	int count=str.length();
	public void spl()
	{
		System.out.println("Length of String is:"+count);
		System.out.println("Split Array");
		st=str.split(" ");
		st1=st[1];
		System.out.println(st1);
		String temp=st[0];
		System.out.println(temp);
		int c=temp.length();
		for(int i=c-1;i>=0;i--)
		{
			rev=rev+temp.charAt(i);
		}
		System.out.println(rev);

		
		int ct=st1.length();
		for(int i=ct-1;i>=0;i--)
		{
			rev1=rev1+st1.charAt(i);
		}
			System.out.println(rev+" "+rev1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplitReverseString oo=new SplitReverseString();
		oo.spl();

	}

}
