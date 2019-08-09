package StringDemo;

public class ReplacewdstarString {
	String st="He is Nonsense stupid and foolish boy";
	String rep="";
	String rep1="";
	String rep2="";
	int ct=st.length();
	public void repl()
	{
		for(int i=st.length()-1;i>=0;i--)
		{
			if(st.contains("Nonsense" ))
			{
				rep=st.replace("Nonsense", "*****" );
			}
			if(st.contains("stupid"))
			{
				rep1=st.replace("stupid", "*****");
			}
			if(st.contains("foolish"))
			{
				rep2=st.replace("foolish", "*****");
			}
		}
		System.out.println(rep);
		System.out.println(rep1);
		System.out.println(rep2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplacewdstarString oo=new ReplacewdstarString();
		oo.repl();
		

	}

}
