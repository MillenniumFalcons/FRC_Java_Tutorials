package org.usfirst.frc.team3647.robot;

public class Encoders 
{
	public double leftEncoderValue, rightEncoderValue;
	
	public void setEncoderValues()
	{
		leftEncoderValue = Motors.rightSRX.getSensorCollection().getQuadraturePosition();
		rightEncoderValue = -Motors.leftSRX.getSensorCollection().getQuadraturePosition();
	}
	
	public static void resetEncoders()
	{
		Motors.leftSRX.getSensorCollection().setQuadraturePosition(0, 10);
		Motors.rightSRX.getSensorCollection().setQuadraturePosition(0, 10);
	}
	
	public void testEncoders()
	{
		System.out.println("Left Encoder Value: " + leftEncoderValue);
		System.out.println("Right Encoder Value: " + rightEncoderValue);
	}
}
