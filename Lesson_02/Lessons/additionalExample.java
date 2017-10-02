/*
Lesson _02
In this lesson we will learn more a about conditional statements
In this example we will be covering more about relational and logical operators
 */

/*
 * @author Surya
 */
public class additionalExample 
{
	public static void main(String[]args)
	{
		boolean happy = false;
		boolean sad = true;
		
		boolean leftMotorIsWorking = true;
		boolean rightMotorIsWorking = true;
		
		if(happy)
		{
			System.out.println("You are happy.");
		}
		//Another way of say if(happy) is if(happy == true)
		
		if(!happy)
		{
			System.out.println("You are not happy. :(");
		}
		//Another way of say if(!happy) is if(happy == false)
		
		if(happy != sad)
		{
			if(happy && !sad) //Another way of saying if(happy && !sad) is if(happy == true && sad == false)
			{
				System.out.println("You are happy. You should feel proud.");
			}
			
			if(!happy && sad) //Another way of saying if(!happy && sad) is if(happy == false && sad == true)
			{
				System.out.println("You are sad. I feel bad for you.");
			}
		}
		if(happy == sad)
		{
			System.out.println("Your emotions make no sense");
		}
		
		if(leftMotorIsWorking || rightMotorIsWorking)
		{
			System.out.println("One of the motors is working. Maybe even both are working");
		}
		if(!leftMotorIsWorking || !rightMotorIsWorking)
		{
			System.out.println("One of the motors is not working .Maybe even both aren't working");
		}
		
	}
	// else statements wer'nt used for the sake of learning about relational and logical operators
}