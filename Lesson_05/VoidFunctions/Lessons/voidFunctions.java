public class voidFunctions
{
	static int surfaceArea, volume, length, width, height;
	
	public static void main(String[]args)
	{
		height = 9;
		width = 8;
		length = 7;
		calcVolume();
		calcSurfaceArea();
		System.out.println("The volume of the rectangular prism is " + volume);
		System.out.println("The surface area of the rectangular prism is " + surfaceArea);
	}
	
	public static void calcVolume()
	{
		volume = length * width * height;
	}
	
	public static void calcSurfaceArea()
	{
		surfaceArea = (width * length) +  (height * length) + (width * height);
		surfaceArea*=2;
	}
}