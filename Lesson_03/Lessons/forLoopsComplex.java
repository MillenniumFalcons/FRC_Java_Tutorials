/*
Lesson _03
In this lesson we will learn how to use nested for loops in java
Nested loops are when a loop is within a loop
Here are some Examples
 */

/*
 * @author Surya
 */

public class forLoopsComplex 
{
	public static void main(String[]args)
	{
		
		System.out.println("Lets create a random pattern using numbers");
		for(int i=1; i<=7;i++) 
		{
            for (int j=1; j<i+1; j++) 
            {
                System.out.print(j);
            }
            System.out.print(1);
            System.out.println();
        }
		
		System.out.println("Lets create a random pattern using numbers");
		for (int i=0; i<=5;i++) 
		{
			System.out.print("|");
			for(int j=4; j>4-i;j--)
			{
				System.out.print("*");
			}
			System.out.print("\\");
			
			for(int j=1; j<12-(2*i);j++)
			{
				System.out.print("*");
			}
			System.out.print("/");
			
			for(int j=4; j>4-i;j--)
			{
				System.out.print("*");
			}
			System.out.print("|");
			
			
			System.out.println();
        }
		
		
	}
}
