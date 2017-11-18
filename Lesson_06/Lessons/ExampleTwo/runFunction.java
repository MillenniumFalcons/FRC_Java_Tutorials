public class runFunction
{
	public static void main(String[]args)
	{
		int run = 4;
		// 1 is square
		// 2 is rectangle
		// 3 is triangle
		// 4 is circle
		
		double squareSide = 2;
		
		double rectLength = 4;
		double rectWidth = 7;
		
		double sideOne = 5;
		double sideTwo = 3;
		double sideThree = 4;
		
		double radius = 4;
		
		Square squareObject = new Square(squareSide);
		Rectangle rectObject = new Rectangle(rectLength, rectWidth);
		Triangle triObject = new Triangle(sideOne, sideTwo, sideThree);
		Circle circObject = new Circle(radius);
		
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
			System.out.println("The variable run, has an inappropriate value.");
		}
		
	}
}