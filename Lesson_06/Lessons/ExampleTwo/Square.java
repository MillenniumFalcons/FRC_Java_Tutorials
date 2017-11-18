public class Square 
{
	double side;//variable used for calculation purposes
	public Square(double s) //This is what we call the constructor, it acts like parameters (used to import variable from other classes)
	{
		side = s;
	}
	
	public double returnArea() // This function returns the value of the Area
	{
		return side*side;
	}
	
	public double returnPerimeter() // This function returns the value of the Perimeter
	{
		return 4*side;
	}
}
