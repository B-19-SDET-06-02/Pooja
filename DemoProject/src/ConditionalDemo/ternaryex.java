package ConditionalDemo;

public class ternaryex {
	int x=20;
	public void ter()
	{
		String sup=(x<15)? "Small":(x<22)? "Tiny" : "Huge";
		System.out.println(sup);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ternaryex tr=new ternaryex();
		tr.ter();

	}

}
