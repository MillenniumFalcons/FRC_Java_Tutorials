public class Circle 
{
	double radius; //variable used for calculation purposes
	public Circle(double r) //Constructor
	{
		radius = r;
	}
	public double returnArea() // This function returns the value of the Area
	{
		return Math.PI * radius * radius;
	}
	
	public double returnPerimeter() // This function returns the value of the Perimeter
	{
		return Math.PI * radius * 2;
	}
}
