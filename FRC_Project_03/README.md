# FRC Project 02 #
In this project, you are going to select a partner to be able to work with, and both of you will be creating algorithm that does the following:
* You must create a drivetrain that moves forward or backward straight depending on the value of the ```leftJoySticky``` in the Joystick file. In order to drive straight, you are going to implement a program that can make the robot go straight by using encoder values. 

## Using Joystick values ##
In the previous lesson we learned that you can set a motor to speed from ```-1``` to ```1```. Fortunately, this is how the Joystick works to. Analog joysticks have values from ```-1``` to ```1```, and buttons have values of ```true``` or ```false```. So if you would like for the robot motors to move in the direction to the value of the ```leftJoySticky``` variable, the following code would work (Assuming you have created the Spark objects in the Motors file, and that you have created the ```joyStickObject``` object):
```
public void teleopPeriodic() 
{
	Motors.leftMotor.set(joyStickObject.leftJoySticky);
	Motors.rightMotor.set(-joyStickObject.leftJoySticky);
}
```
