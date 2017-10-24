package lessons;

/*
Lesson _04
Here is another example of while loops...
 */

/*
 * @author Surya
 */

public class AnotherExample 
{
	public static void main(String[]args)
	{
		double distaceRequiredToTravel = 450; //in miles
		double averageSpeed = 90;//in mph
		double distanceTravelled = 0;
		double timeInMinutes = 0;
		double  timeInHours = 0;
		System.out.println("Let's start travelling.");
		while(distanceTravelled  != distaceRequiredToTravel)
		{
			distanceTravelled += (averageSpeed/60);
			timeInMinutes +=1;
		}
		timeInHours = timeInMinutes/60;
		System.out.println("It took " + timeInHours + " hours to travel " + distanceTravelled + " miles.");
	}

}