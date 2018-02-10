package team3647pistons;

import edu.wpi.first.wpilibj.Solenoid;

public class SinglePistonExample 
{
	//Here is an Example of a single piston
	

	//The Solenoid object
	public static Solenoid piston = new Solenoid(1);
	
	public static void openPiston()
	{
		piston.set(true);
	}
	
	public static void closePiston()
	{
		piston.set(false);
	}
	
	//The function we will be calling in Robot.java
	public static void runPiston(boolean joyValue)
	{
		if(joyValue)
		{
			openPiston();
		}
		else
		{
			closePiston();
		}
	}

}
