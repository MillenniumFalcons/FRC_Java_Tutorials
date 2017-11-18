public class Triangle
{
	double sideOne, sideTwo, sideThree; //variables used for calculation purposes
	public Triangle(double s1, double s2, double s3) //Constructor
	{
		sideOne = s1;
		sideTwo = s2;
		sideThree = s3;
	}
	
	public double returnArea() // This function returns the value of the Area
	{
		double p = returnPerimeter()/2;
		return Math.pow((p) * (p - sideOne) * (p - sideTwo) * (p - sideThree), .5);
	}
	
	public double returnPerimeter() // This function returns the value of the Perimeter
	{
		return sideTwo + sideOne + sideThree;
	}
}