# FRC Project 03 #
In this project, you are going to select a partner to be able to work with, and both of you will be creating algorithm that does the following:
* You must create a drivetrain that moves forward or backward straight depending on the value of the ```leftJoySticky``` variable in the Joystick file. In order to drive straight, you are going to implement a program that can make the robot go straight by using encoder values. 

## Using Joystick values ##
In the FRC Project_01, we learned that you can set a motor to a speed from ```-1``` to ```1```. Fortunately, this is how the Joystick works to. Analog joysticks have values from ```-1``` to ```1```, and buttons have values of ```true``` or ```false```. There is also something called a deadzone we add to analog joystick values. The purpose of this is to avoid values like ```.01```, ```.12```, etc. For instance the value of analog joysticks are never techincally ```0```, they are just close to 0. Since we dont want the robot to move unless the joystick has a value of above ```.15```, we make the deadzone ```.15```. This means that if the joystick value is any less than ````.15``` or greater than ```-.15```, we set the value of the hoystick to 0.

So if you would like for the robot motors to move in the direction to the value of the ```leftJoySticky``` variable, the following code would work (Assuming you have created the Spark objects in the Motors file, and that the ```leftJoySticky``` variable in the Joysticks class is ```static```):
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

Here are a list of clues/changes you would have to make from your previous exercise:
* Slight change in your algorithm due to fact that it has to now be able to travel backwards straightly too.
* Since the program will be tele operated, there will be no ```distance``` variable unlike the previous project.
* You would if
