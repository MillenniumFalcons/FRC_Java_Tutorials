package org.usfirst.frc.team3647.robot;

public class Autonomous 
{
	String autoSelected = "middleAuto";
	
	public void runAuto(double lEnc, double rEnc)
	{
		if(autoSelected.equals("middleAuto"))
		{
			middleAuto(lEnc, rEnc);
		}
		else if(autoSelected.equals("rightAuto"))
		{
			rightAuto(lEnc, rEnc);
		}
		else if(autoSelected.equals("leftAuto"))
		{
			leftAuto(lEnc, rEnc);
		}
		else
		{
			Motors.leftSRX.set(0);
			Motors.rightSRX.set(0);
		}
	}
	
	public void middleAuto(double lEnc, double rEnc)
	{
		
	}
	
	public void rightAuto(double lEnc, double rEnc)
	{
		
	}
	
	public void leftAuto(double lEnc, double rEnc)
	{
		
	}
	

}
