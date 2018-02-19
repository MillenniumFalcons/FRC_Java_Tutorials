package team3647pistons;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;

public class TapSinglePiston 
{
	public static Solenoid piston = new Solenoid(5);
	
	public static void pistonOn()
	{
		piston.set(true);
	}
	
	public static void pistonOff()
	{
		piston.set(false);
	}
	
	public static void runPiston(boolean joyValue)
	{
		if(joyValue)
		{
			if(!piston.get())
			{
				pistonOn();
				Timer.delay(.75);
			}
			else
			{
				pistonOff();
				Timer.delay(.75);
			}
		}
	}
}
