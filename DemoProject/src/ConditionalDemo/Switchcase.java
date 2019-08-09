package ConditionalDemo;
import java.util.Scanner;

public class Switchcase {
	int num1,num2,res,Choice;
	Scanner scn=new Scanner(System.in);
	//Create user defined method for input values
	public void enter()
	{
		System.out.println("Enter value of num1");
		num1=scn.nextInt();
		System.out.println("Enter value of num2");
		num2=scn.nextInt();
	}
	//Create another user defined method for output
	public void check()
	{
		System.out.println("1.Add\t\t 2.Sub\n3.Multiply\t 4.Div");
		System.out.println("Enter your choice:");
		Choice=scn.nextInt();
	
		 //Create multiple switch cases
		 switch(Choice)
		 {
		 case 1:
				enter();
		 		res=num1+num2;
		 		System.out.println("Result of Addition:"+res);
		 		break;
		 case 2:
			  	enter();
		 		res=num1-num2;
		 		System.out.println("Result of Subtraction:"+res);
		 		break;
		 case 3:
			 	enter();
		 		res=num1*num2;
		 		System.out.println("Result of Multiplication:"+res);
		 		break;
		 case 4:
			   	enter();
		 		res=num1/num2;
		 		System.out.println("Result of Division:"+res);
		 		break;
		 default:
			 System.out.println("Sorry you select invalid choice");
			 break;
		 		
		 }	 	
		 
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switchcase swt=new Switchcase();
		swt.check();
	}
}
