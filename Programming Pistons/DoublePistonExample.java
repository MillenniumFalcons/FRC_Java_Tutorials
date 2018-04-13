package team3647pistons;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class DoublePistonExample 
{
	//Here is an Example of a single piston
	
	//The Solenoid object
	public static DoubleSolenoid piston = new DoubleSolenoid(1,2);
	
	public static void openPiston()
	{
		piston.set(DoubleSolenoid.Value.kForward);
	}
	
	public static void closePiston()
	{
		piston.set(DoubleSolenoid.Value.kReverse);
	}
	
	//The function we will be calling in Robot.java and Auto
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
