/*
Lesson _02
In this lesson we will learn how to use conditional statements
A conditional statement is a feature in programming, which performs computations depending on if a condition is met or not
Here is an Example File
 */

/*
 * @author Surya
 */

public class IfStatements
{
	public static void main(String[] args) 
	{
		String name = "Klint";
		int albumsSold = 0 ;
		String status;
		
		if(albumsSold > 5)
		{
			status = " sold more than 5 albums.";
		}
		else if(albumsSold == 5)
		{
			status = " sold 5 albums.";
		}
		else if(albumsSold == 4)
		{
			status = " sold 4 albums.";
		}
		else if(albumsSold == 3)
		{
			status = " sold 3 albums.";
		}
		else if(albumsSold == 2)
		{
			status = " sold 2 albums.";
		}
		else if(albumsSold == 1)
		{
			status = " sold 1 album.";
		}
		else
		{
			status = " sold no albums. RIP Klint.";
		}
		
		System.out.println(name + status);
		
  	}
}