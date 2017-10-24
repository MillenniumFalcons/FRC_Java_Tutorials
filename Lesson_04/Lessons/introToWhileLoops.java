/*
Lesson _04
In this lesson we will learn how to use while loops in java
While loops are when a loop is run infinitely until a certain condition is met
Here are some Examples
 */

/*
 * @author Surya
 */

public class introToWhileLoops 
{
	public static void main(String[]args)
	{
		//lets write a microwave program
		int currentCoffeeTemperatre = 112;
		int coffeeTemperatreRequired = 155;
		int numberOfMinutesToHeatTheCoffee = 0;
		System.out.println("The coffee is " + currentCoffeeTemperatre + " degrees right now!");
		System.out.println("Now let's put the coffee in the microwave to heat it up to " + coffeeTemperatreRequired + " degrees");
		while(currentCoffeeTemperatre < coffeeTemperatreRequired)
		{
			numberOfMinutesToHeatTheCoffee++;
			currentCoffeeTemperatre++;
		}
		System.out.println("The temperature of the coffee right now is " + currentCoffeeTemperatre);
		System.out.println("It took " + numberOfMinutesToHeatTheCoffee + " minutes to heat the coffee to " +  coffeeTemperatreRequired + " degrees");
	}
}