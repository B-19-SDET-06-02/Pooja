package LoopDemo;

public class Fibonacci {
	int a=0,c;
	public void fib()
	{
		for(int b=0;b<=8;b++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fb=new Fibonacci();
		fb.fib();
	}

}
