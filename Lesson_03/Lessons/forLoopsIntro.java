/*
Lesson _03
In this lesson we will learn how to use for loops in java
In computer science a for loop is a statement for specifying iteration, which allows code to be executed repeatedly.
Here are some Examples
 */

/*
 * @author Surya
 */

public class forLoopsIntro 
{
	public static void main(String[]args)
	{
		System.out.println("Eamon is...");
		for(int i =1; i<=5;i++)
		{
			System.out.println("Eamon is undedicated!");
		}
		
		System.out.println("Lets count from 1-5");
		for(int i =1; i<=5;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("Lets print out the squares of numbers");
		for(int i =1; i<=5;i++)
		{
			System.out.println("The square of " + i + " is: " + (i*i));
		}
		
		System.out.println("Lets create an arithmetic sequence now:");
		for(int i =2; i<=10;i+=2)
		{
			
			System.out.println(i);
		}
		
		System.out.println("Lets create a geometric sequence now:");
		double number = 2;
		for(int i =1; i<=5;i++)
		{
			System.out.println((Math.pow(number, i)));
		}
		
		System.out.println("Lets count backwards");
		for(int i =5; i>=0;i--)
		{
			System.out.println(i);
		}
		
	}

}