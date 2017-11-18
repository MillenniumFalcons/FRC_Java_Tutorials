# FRC Project 01 #
In this project, you are going to select a partner to be able to work with, and both of you will be creating algorithm that does the following:
* When you initially run the robot code, the robot must initially move forward. But when you press a given button on the joystick, it must move backward. And when the button is pressed again, it should go back front, and so on and so forth.

## Robot.java ##
The Robot.java file is the main file for the projects we will be creating. It contains all the functions we will be running while we will be programming for the robot.
Lets go over some of the functions it contains:
* ```robotInit()```:   The robotInit() function stands for robot initialization and is run whenever the robot starts. For initialization of the code, the ```robotInit()``` function is executed before running any piece of code. This function is also used for assigning objects.
* ```autonomousInit()```: The autonomousInit() function stands for autonomous initialization. This function runs once, right before autonomous period starts. 
* ```autonomousPeriodic()```: The autonomousPeriodic() function is the function that is called during the autonomous period. This function runs periodically, meaning it acts as an infinite loop.
* ```teleopPeriodic()```: The teleopPeriodic() function is the function that is called during the teleoperated period. This function runs periodically, meaning it acts as an infinite loop.
* ```testPeriodic()```: The testPeriodic() is the function that is called during the test. The test is an option available in the driver station and can be used to test specific pieces of code.

## Motors implementation ##
In order to implement motors into our robot code, it is an excellent method to create a separate class for the motors themselves.  Here is an example:
```
import edu.wpi.first.wpilibj.Spark;

public class Motors 
{
	public Spark leftMotor = new Spark(2);
	public Spark rightMotor = new Spark(1);
}
```
In this piece of code, we created to 2 Spark objects. The Spark is an automatic class we can use the FRC Java plugins we installed earlier. In order to use the Spark class, we just need to import the Spark class, by stating the following: ```import edu.wpi.first.wpilibj.Spark;```. 

To implement this class into the Robot.java class we can either create a ```Motors``` object in the robot.java file, or we can make both the objects in the Motors static and directly call them from the ```Motors``` class. Here is an example of how we can do it either way:
* The ```Motors``` object way: In this case, we are making both our motor objects non-static. Thus we make an object in the Robot class which enables us to access the objects from the Motor class. Note: You cannot access non-static methods/objects/ variables in other classes unless you obtain those through an object.
```
import edu.wpi.first.wpilibj.Spark;

public class Motors 
{
	public Spark leftMotor = new Spark(2);
	public Spark rightMotor = new Spark(1);
}
```

```
public class Robot extends IterativeRobot 
{
	Motors motorObject;
	public void robotInit() 
	{
		motorObject = new Motors();
	}
}
```

* The ```Motors``` static way: In this case, we just make both our motor objects static. This way we can access objects from other classes without creating an object. If you would like to access these objects in the Robot.java file, you would just have to state: ```Motors.leftMotor.whatFunctionYouWouldLikeToUse()```. Note: The object ```leftMotor``` does not have a method called ```whatFunctionYouWouldLikeToUse()```, it was just an example of how you would the object in the Robot.java file.
```
import edu.wpi.first.wpilibj.Spark;

public class Motors 
{
	public static Spark leftMotor = new Spark(2);
	public static Spark rightMotor = new Spark(1);
}
```

Note: There are a lot of different types of motors we can use, and each kind of motor has its own class. So for example, there is a type of motor called Victors, and it has a class name called ```Victor```. Some other examples include Talons, Jaguars, etc. Here is how it would differ in the code:
* Sparks
```
import edu.wpi.first.wpilibj.Spark;

public class Motors 
{
	public static Spark leftMotor = new Spark(2);
	public static Spark rightMotor = new Spark(1);
}
```

* Talons
```
import edu.wpi.first.wpilibj.Talon;

public class Motors 
{
	public static Talon leftMotor = new Talon(2);
	public static Talon rightMotor = new Talon(1);
}
```

* Victors
```
import edu.wpi.first.wpilibj.Victor;

public class Motors 
{
	public static Victor leftMotor = new Victor(2);
	public static Victor rightMotor = new Victor(1);
}
```

Although there are different classes for each type of motor, the methods for all the motor types are all the same. In order to make our robot move, we use the ```set()``` function in the Spark Class (It is the same method for all the different type of motors too). Here are 2 different examples:
* When our motors are static:
```
import edu.wpi.first.wpilibj.Spark;

public class Motors 
{
	public static Spark leftMotor = new Spark(2);
	public static Spark rightMotor = new Spark(1);
}
```
```
public class Robot extends IterativeRobot 
{
	public void autonomousPeriodic() 
	{
		Motors.leftMotor.set(.5);
		Motors.rightMotor.set(.5);
	}	
}
```
* When our motors are non-static:
```
import edu.wpi.first.wpilibj.Spark;

public class Motors 
{
	public  Spark leftMotor = new Spark(2);
	public  Spark rightMotor = new Spark(1);
}
```
```
public class Robot extends IterativeRobot 
{
	Motors motorObject;
	public void robotInit() 
	{
		motorObject = new Motors();
	}
	
	public void autonomousPeriodic() 
	{
		motorObject.leftMotor.set(.5);
		motorObject.rightMotor.set(.5);
	}
}
```
As you might have guessed, this means that the robot is moving forward at half of its maximum speed. The maximum speed is ```1```, and the minimum speed is ```-1```. 
* ```1```: the motor is moving towards the positive direction at its full speed.
* ```0```: the motor is not spinning.
* ```-1```: the motor is moving towards the negative direction at its full speed.

Note: Since the motors in our robot are facing different directions, in order for both of the motors to move in the same direction, the values of the left motor and the right motor must be negative to each other. For example in our robot:
* If we want to move forward (static motors) during the autonoumous period:
```
public class Robot extends IterativeRobot 
{
	public void autonomousPeriodic() 
	{
		Motors.leftMotor.set(.5);
		Motors.rightMotor.set(-.5);
	}	
}
```
* If we would like to move backward (static motors) during the autonoumous period:
```
public class Robot extends IterativeRobot 
{
	public void autonomousPeriodic() 
	{
		Motors.leftMotor.set(-.5);
		Motors.rightMotor.set(.5);
	}	
}
```
Note: It is HIGHLY recommended to use static motors in your project. If you would like to learn more about the Spark class please read the FRC Documentation for [Sparks](http://first.wpi.edu/FRC/roborio/beta/docs/java/edu/wpi/first/wpilibj/Spark.html).

## Joystick Implementation ##
For your projects, the ```JoySticks``` class will be prewritten for you. But here is the code: 
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
		rightBumper =	mainController.getRawButton(6);
		leftBumper =	mainController.getRawButton(5);
		leftTrigger =mainController.getRawAxis(2);
		buttonA =	mainController.getRawButton(1);
		buttonB = mainController.getRawButton(2);
		rightTrigger =mainController.getRawAxis(3);
		buttonY = mainController.getRawButton(4);
		leftJoySticky =-mainController.getRawAxis(1);
		leftJoyStickx =mainController.getRawAxis(0);
		rightJoyStickx =mainController.getRawAxis(4);
		rightJoySticky =mainController.getRawAxis(5);
		
	}
}
```
The ```mainController``` is the Joystick object we use to obtain values from the controller. We use the ```getRawButton``` function for digital, and ```getRawAxis()``` for analog. We use the ```updateMainController()``` function to assign values to the joystick variables. 

So, in order to implemet this class into the Robot.java file, we create a Joystick Object. 
```
public class Robot extends IterativeRobot 
{
	Joysticks joyStickObject;
	public void robotInit() 
	{
		joyStickObject = new Joysticks();
	}
}
```
If we would like the robot to move forward when a button is pressed, and for the robot to not move when the button is not pressed, the code will look something like this (assuming you have already created the joystick object):
```
public void teleopPeriodic() 
	{
		if(joyStickObject.buttonA)
		{
			Motors.leftMotor.set(.5);
			Motors.rightMotor.set(-.5);
		}
		else
		{
			Motors.leftMotor.set(0);
			Motors.rightMotor.set(0);
		}
	}
```

If you would like to learn more about the Joystick class created by FIRST, please read the about the Joystick class from the FRC Java [API](http://first.wpi.edu/FRC/roborio/beta/docs/java/edu/wpi/first/wpilibj/Joystick.html).

Good luck on the project!
