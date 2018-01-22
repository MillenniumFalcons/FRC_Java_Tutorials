package org.usfirst.frc.team3647.robot;

public class Motors 
{
	public static WPI_TalonSRX leftSRX = new WPI_TalonSRX(0);
	public static WPI_TalonSRX rightSRX = new WPI_TalonSRX(3);
	
	public static VictorSPX leftSPX1 = new VictorSPX(1);
	public static VictorSPX rightSPX1 = new VictorSPX(0);
	public static VictorSPX leftSPX2 = new VictorSPX(2);
	public static VictorSPX rightSPX2 = new VictorSPX(3);
	
	public static void drivetrainInitialization()
	{
		setLeftMotorSpeed(0);
		setRightMotorSpeed(0);
		leftSPX1.follow(leftSRX);
		leftSPX2.follow(leftSRX);    
		rightSPX1.follow(rightSRX);
		rightSPX2.follow(rightSRX);
	}
	
	
}
