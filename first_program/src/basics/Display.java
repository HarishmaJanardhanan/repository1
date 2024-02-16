package basics;

public class Display 
{
	
	public static int product()
	{
		int t=12,n=13;
		int x=t*n;
		return x;
	}
	public static double average()
	{
		double f=3.5,g=5.1,h=6.9;
		return (f+g+h)/3;
	}
	public static void main(String args[])
	{
		System.out.println("Product of 2 numbers :"+Display.product());
		System.out.println("Average of 3 numbers :"+Display.average());
	}

}
