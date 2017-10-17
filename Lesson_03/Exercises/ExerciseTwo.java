/*
Lesson _03
In this exercise, you will use nested for loops in order to print the following:
 \:::::::/
  \:::::/
   \:::/
    \:/

Good Luck Completing the exercise!
*/

/*
 * @author Surya
 */

public class ExerciseTwo 
{
	public static void main(String[]args)
	{

		for(int i=1; i<=4; i++)
		{
			for(int a=3; a>3-i; a--)
			{
				System.out.print(" ");
			}
			System.out.printf("\\");
			for(int b=1; b<10-(2*i); b++)
			{
				System.out.print(":");
			}
			System.out.print("/");
			System.out.println();
		}

	}
}