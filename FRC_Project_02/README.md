# FRC Project 02 #
In this project, you are going to select a partner to be able to work with, and both of you will be creating an algorithm that does the following:
* The robot must be able to drive forward straightly at ```0.3``` speed for a given distance. For example, you can create a method called ```public void goStraight(double distance)``` where the function makes the robot go straight until the encoder values for both the sides have reached the value of ```distance```.

## Encoders ##
For this project, encoders are sensors that measure how much degrees a wheel has been rotated. So for example, if a wheel has gone through a full 360-degree rotation, the value of the encoder would be ```360```. If the wheel were stationary for the whole period, then the value of the encoder would be ```0```. Encoders are very useful to make sure our robot travels accurately autonomously, as they enable us to make turns accurate, and they also help us drive straight.

The way we use encoders in our program is by creating an Encoders class and making two objects: one object for the wheels on the left of the robot, and one object for the wheels for the right of the robot. In this case, the ```leftEncoder``` object represents the encoder on the left wheels of the robot, and the ```rightEncoder``` object represents the encoder on the right wheels of the robot: 
```
import edu.wpi.first.wpilibj.Encoder;
public class Encoders 
{
	Encoder leftEncoder = new Encoder(0,1, false, Encoder.EncodingType.k4X);
	Encoder rightEncoder = new Encoder(4,5, false, Encoder.EncodingType.k4X);
}
```

After declaring the ```leftEncoder``` and ```rightEncoder``` objects in the ```Encoders``` class, we can use them in the ```Robot``` class by creating an ```Encoders``` Object:
```
public class Robot extends IterativeRobot 
{
	Encoders encodersObject;
	public void robotInit() 
	{
		encodersObject = new Encoders();
	}
}
```

The way we obtain the encoder values from each ```Encoder``` object is by calling the ```get()``` function. The following is the code on how to get encoder values from the ```Encoder``` class and how to use that in the ```Robot``` class assuming that you have already created both the ```leftEncoder``` and the ```rightEncoder``` objects in the ```Encoders``` class and that you have created the ```encodersObject``` object in the ```Robot``` class:
* ```Encoders.java```
```
public class Encoders 
{
	//This function returns the value of the right encoder
	public double getRightEncoder()
	{
		return rightEncoder.get();
	}
  
	//This function returns the value of the left encoder
	public double getLeftEncoder()
	{
		return leftEncoder.get();
	}
}
```
* ```Robot.java```
```
public class Robot extends IterativeRobot 
{	
	public void autonomousPeriodic() 
	{
		double leftEncoderValue = encodersObject.getLeftEncoder();
		double rightEncoderValue = encodersObject.getRightEncoder();
	}
}
```

We can also set encoder values to ```0``` by calling the ```reset()``` function:
* ```Encoders.java```
```
public class Encoders 
{
	//This function sets the value of both the encoders to 0
	public void resetEncoders()
	{
		rightEncoder.reset();
		leftEncoder.reset();
	}
}
```
* ```Robot.java```
```
public class Robot extends IterativeRobot 
{	
	public void autonomousInit() 
	{
		encodersObject.resetEncoders();
	}
}
```
