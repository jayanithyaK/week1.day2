package week1.day2;

public class Calculator {
	
	public int getAdd(int a, int b)
	{
	return a+b;
}
public double getSub(double a , double b)
{
return a-b;
}
public double getMul(double a , double b)
{
	return a*b;
}

public double getDiv(double a , double b)
{
	return a/b;
}

	public static void main(String[]arg)
	{
		Calculator cal = new Calculator();
		
		System.out.println(cal.getAdd(5, 4));
		System.out.println(cal.getSub(10, 6));
		System.out.println(cal.getMul(3, 8));
		System.out.println(cal.getDiv(50, 5));
	}
	}
	
	
	
	

