package StringBuffer;

public class EnsureCapacity {
	StringBuffer sb=new StringBuffer();
	public void ecp()
	{
	System.out.println(sb.capacity());
	sb.ensureCapacity(50);
	System.out.println(sb.capacity());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnsureCapacity oo=new EnsureCapacity();
		oo.ecp();

	}

}
