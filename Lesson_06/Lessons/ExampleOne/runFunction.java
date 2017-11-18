public class runFunction
{
	public static void main(String[]args)
	{
		int run = 4;
		// 1 is square
		// 2 is rectangle
		// 3 is triangle
		// 4 is circle
		
		//variables used for Square object parameters
		double squareSide = 2;
		
		//variables used for Rectangle object parameters
		double rectLength = 4;
		double rectWidth = 7;
		
		//variables used for Triangle object parameters
		double sideOne = 5;
		double sideTwo = 3;
		double sideThree = 4;
		
		//variables used for Circle object parameters
		double radius = 4;
		
		Square squareObject = new Square(squareSide); //The Square Object
		Rectangle rectObject = new Rectangle(rectLength, rectWidth); //The Rectangle Object
		Triangle triObject = new Triangle(sideOne, sideTwo, sideThree); //The Triangle Object
		Circle circObject = new Circle(radius); //The Circle Object
		
		if(run == 1)
		{
			System.out.println("The area of the square is " + squareObject.returnArea());
			System.out.println("The perimeter of the square is " + squareObject.returnPerimeter());
		}
		else if(run == 2)
		{
			System.out.println("The area of the rectangle is " + rectObject.returnArea());
			System.out.println("The perimeter of the rectangle is " + rectObject.returnPerimeter());
		}
		else if(run == 3)
		{
			System.out.println("The area of the triangle is " + triObject.returnArea());
			System.out.println("The perimeter of the triangle is " + triObject.returnPerimeter());
		}
		else if(run == 4)
		{
			System.out.println("The area of the circle is " + circObject.returnArea());
			System.out.println("The perimeter of the circle is " + circObject.returnPerimeter());
		}
		else
		{
			System.out.println("The variable 'run', has an inappropriate value.");
		}
		
	}
}

//The Square class
class Square
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

class Rectangle
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

class Triangle
{
	double sideOne, sideTwo, sideThree; //variables used for calculation purposes
	public Triangle(double s1, double s2, double  s3) //Constructor
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

class Circle
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