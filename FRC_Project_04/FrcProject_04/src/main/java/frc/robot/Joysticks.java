package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
public class Joysticks 
{
	//The Joy stick Object
	public Joystick mainController = new Joystick(0);
	
	//Joy stick Variables
	public static boolean rightBumper;
	public static boolean leftBumper;
	public static boolean buttonA;
	public static boolean buttonB;
	public static boolean buttonX;
	public static boolean buttonY;
	public static double rightTrigger;
	public static double leftTrigger;	
	public static double leftJoySticky;
	public static double rightJoyStickx;
	public static double rightJoySticky;
	public double leftJoyStickx;
	
	//assigning values to variables through this function
	public void updateMainController()
	{
		rightBumper =	mainController.getRawButton(6);
		leftBumper =	mainController.getRawButton(5);
		leftTrigger = fixController(mainController.getRawAxis(2));
		buttonA =	mainController.getRawButton(1);
		buttonB = mainController.getRawButton(2);
		rightTrigger = fixController(mainController.getRawAxis(3));
		buttonY = mainController.getRawButton(4);
		leftJoySticky = fixController(-mainController.getRawAxis(1));
		leftJoyStickx = fixController(mainController.getRawAxis(0));
		rightJoyStickx = fixController(mainController.getRawAxis(4));
		rightJoySticky = fixController(mainController.getRawAxis(5));
		
	}
	
	//Dead-zone function
	public double fixController(double joyStickValue)
	{
		if(joyStickValue < .15 && joyStickValue > -.15)
		{
			return 0;
		}
		else
		{
			return joyStickValue;
		}
	}
}