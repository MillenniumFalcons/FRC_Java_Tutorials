# FRC Project 03 #
In this project, you are going to select a partner to be able to work with, and both of you will be creating  an algorithm that does the following:
* You must program a drivetrain that moves forward or backward straight depending on the value of the ```leftJoySticky``` variable in the Joystick file. To drive straight, you are going to create a program that can make the robot go straight by using encoder values. 

## Using Joystick values ##
In the FRC Project_01, we learned that you could set a motor to a speed from ```-1``` to ```1```. Fortunately, this is how the Joystick works too. Analog joysticks have values from ```-1``` to ```1```, and buttons have values of ```true``` or ```false```. There is also something called a dead-zone we add to analog joystick values. The purpose of this is to avoid values like ```.01```, ```.12```, etc. For instance, the value of an analog joystick is never technically ```0```. They are just close to ```0```.  Since we don't want the robot to move unless the joystick has a value of above ```.15```, we make the dead-zone ```.15```. This means that if the joystick value is any less than ```.15``` or greater than ```-.15```, we set the value of the joystick to 0.
```
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
	public static double leftJoyStickx;
	
	//assigning values to variables through this function
	public void updateMainController()
	{
		rightBumper = mainController.getRawButton(6);
		leftBumper = mainController.getRawButton(5);
		leftTrigger = fixController(mainController.getRawAxis(2));
		buttonA = mainController.getRawButton(1);
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

```

For the robot motors to move in the direction to the value of the ```leftJoySticky``` variable, the following code would work (Assuming you have created the Spark objects in the Motors file, and that the ```leftJoySticky``` variable in the Joysticks class is ```static```):
```
public void teleopPeriodic() 
{
	Motors.leftMotor.set(Joysticks.leftJoySticky);
	Motors.rightMotor.set(-Joysticks.leftJoySticky);
}
```
Here is a picture of the Joystick:
![Pict](http://www.team358.org/files/programming/ControlSystem2015-2019/images/XBoxControlMapping.jpg)

The way we would implement this program by using the Joystick is by using the function you created in [FRC Project_02](https://github.com/MillenniumFalcons/FRC_Java_Tutorials/tree/master/FRC_Project_02), and instead of using the ```speed``` variable to determine speed, you would use the ```leftJoySticky``` variable from the Joystick file. 

Here is a list of clues/changes you would have to make from your previous exercise:
* A slight change in your algorithm because it has to be now able to travel backward straightly too.
* Since the program will be tele-operated, there will be no ```distance``` variable, unlike the previous project.
* You would have to reset encoders whenever the value of```leftJoySticky``` variable becomes ```0```.

Good luck on the project!
