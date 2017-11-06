/*
Lesson _05
In this lesson we will learn how to use void functions in java
In computer science a void function is a function that does not return anything
In this example, we will use void functions to calculate the surface area and the volume of a rectangular prism
 */

/*
 * @author Surya
 */
public class voidFunctions
{
	static int surfaceArea, volume, length, width, height;
	
	public static void main(String[]args)
	{
		height = 9;
		width = 8;
		length = 7;
		calcVolume(); //calls the calcVolume function
		calcSurfaceArea(); //calls the calcSurfaceArea function
		System.out.println("The volume of the rectangular prism is " + volume);
		System.out.println("The surface area of the rectangular prism is " + surfaceArea);
	}
	
	// This is the calcVolume() function 
	public static void calcVolume()
	{
		volume = length * width * height;
	}
	
	// This is the calcSurfaceArea() function 
	public static void calcSurfaceArea()
	{
		surfaceArea = (width * length) +  (height * length) + (width * height);
		surfaceArea*=2;
	}
}