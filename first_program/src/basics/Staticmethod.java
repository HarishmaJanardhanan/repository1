package basics;

public class Staticmethod {
	
	public static void subtract()
	{
		int a=70,b=50;
		System.out.println("subtraction of two numbers: "+(a-b));
		
	}
	public static void main(String args[])
	{
		Staticmethod.subtract();
		Staticmethod.multiply();
	}
	private static void multiply()
	{
		int c=3,d=2;
		System.out.println("Product of 2 numbers :"+(c*d));
	}

}
