/*
Lesson _01
In this lesson we will learn how to use variables in java
Variables are pieces of memory that contain a data value
There are a lot of different types of data types
The basic ones are doubles, booleans, integers, Strings, and floats
Here is an Example
 */

/*
 * @author Surya
 */

public class Variables 
{

    public static void main(String[] args) 
	{
		boolean happy, sad;
		happy = true;
	 	sad = false;
		
		String name, status, teamName;
		name = "Surya";
		status = "terrible code teacher";
		teamName = "Millennium Falcons";
		
		int yearFounded, currentYear;
		yearFounded = 2011;
		currentYear = 2017;
		
		float pi = 3.14f;
		
		double numOne, numTwo, quotient;
		numOne = 4.557;
		numTwo = 1.597;
		quotient = numOne / numTwo;
		
		
        System.out.println("My name is " + name + ".");
        System.out.println("I am a " + status + ".");
        
        System.out.println("The name of this robotics team is " + teamName + ".");
        System.out.println("This team has existed for " + (currentYear - yearFounded) + " years.");
        
        System.out.println(pi + " is the most awesome number in the world.");
        System.out.println(numOne + " divided by " + numTwo + " is " + quotient + ".");
        
  	}
    
}