/*
Lesson _05
In this lesson we will expand our knowledge on how we can use return functions in java
In this example, we will use return functions to heat/cool objects
 */

/*
 * @author Surya
 */

public class returnFunctionsComplex
{
	public static void main(String[]args)
	{
		System.out.println("This program is used to calculate the number of minutes it requires to heat/cool an object.");
		double rate = 2; //degrees per minute
		double currentTemp = 111;
		double requiredTemp = 91;
		if(requiredTemp>currentTemp)
		{
			System.out.println(Heater(currentTemp, requiredTemp, rate));
		}
		else if(requiredTemp<currentTemp)
		{
			System.out.println(Cooler(currentTemp, requiredTemp, rate));
		}
		else
		{
			System.out.println("They are literally the same temperature. Nothing to cool or heat");
		}
	}
	
	//This function heats the object
	static String Heater(double initialTemp, double finalTemp, double rate)
	{
		int time =0; //in minutes
		while(initialTemp<finalTemp)
		{
			initialTemp+=rate;
			time++;
		}
		return "It took " + time + " minutes in order to heat the object.";
	}
	
	//This function cools the object
	static String Cooler(double initialTemp, double finalTemp, double rate)
	{
		int time =0; //in minutes
		while(initialTemp>finalTemp)
		{
			initialTemp-=rate;
			time++;
		}
		return "It took " + time + " minutes in order to cool the object.";
	}
}