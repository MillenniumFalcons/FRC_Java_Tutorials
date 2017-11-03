//In this lesson we use functions to heet or cool objects
public class basicReturnFunctions 
{
	public static void main(String[]args)
	{
		int operation = 4;
		double firstNum = 8.0;
		double secondNum = 4.0;
		//1 is add
		//2 is subtract
		//3 is multiply
		//4 is divide
		if(operation == 1)
		{
			System.out.println("The sum of " + firstNum + " and " + secondNum + " is " + add(firstNum, secondNum) + ".");
		}
		else if(operation == 2)
		{
			System.out.println("The difference of " + firstNum + " and " + secondNum + " is " + subtract(firstNum, secondNum) + ".");
		}
		else if (operation == 3)
		{
			System.out.println("The product of " + firstNum + " and " + secondNum + " is " + multiply(firstNum, secondNum) + ".");
		}
		
		else if (operation == 4)
		{
			System.out.println("The quotient of " + firstNum + " and " + secondNum + " is " + divide(firstNum, secondNum) + ".");
		}
		else
		{
			System.out.println("Invalid input.");
		}
	}
	
	static double add(double numOne, double numTwo)
	{
		return numOne + numTwo;
	}
	static double subtract(double numOne, double numTwo)
	{
		return numOne - numTwo;
	}
	static double multiply(double numOne, double numTwo)
	{
		return numOne * numTwo;
	}
	static double divide(double numOne, double numTwo)
	{
		return numOne / numTwo;
	}
}