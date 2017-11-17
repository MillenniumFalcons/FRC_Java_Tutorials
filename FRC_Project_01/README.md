# FRC Project 01 #
In this project, you are going to select a partner to able to work with, and both of you will be creating algorithm that does the 
following:
* When you initially run the robot code, the robot must initially move forward. But when you press a given button on the joystick, it must move backward. And when the button is pressed again, it should go back front, and so on and so forth.

## Robot.java ##
The Robot.java file is the main file for the projects we will be creating. It contains all the functions we will be running while we will be programming for the robot.
Lets go over some of the functions it contains:
* ```robotInit()```:   The robotInit() function stands for robot initialization and is run whenever the robot starts. For initialization of the code, the ```robotInit()``` function is executed before running any piece of code.
* ```autonomousInit()```: The autonomousInit() function stands for autonomous initialization. This function runs once, right before autonomous period starts. 
* ```autonomousPeriodic()```: The autonomousPeriodic() function is the function that is called during the autonomous period. This function runs periodically, meaning it acts as an infinite loop.
* ```teleopPeriodic()```: The teleopPeriodic() function is the function that is called during the teleoperated period. This function runs periodically, meaning it acts as an infinite loop.
* ```testPeriodic()```: The testPeriodic() is the function that is called during the test. The test is an option available in the driver station and can be used to test specific pieces of code.

