public class Rectangle
{
	double length, width; //variables used for calculation purposes
	public Rectangle(double x, double y) //Constructor
	{
		length = x;
		width = y;
	}
	
	public double returnArea() // This function returns the value of the Area
	{
		return length*width;
	}
	
	public double returnPerimeter() // This function returns the value of the Perimeter
	{
		return 2*(length + width);
	}
}