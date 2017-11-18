# Lesson_04 #

## While loops ##
In programming, a while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.

So for example, if you execute the following piece of code:

```
while(1==1)
{
  System.out.println("Hello World");
}
```
The console would just print out ```Hello World``` an infinite amount of times because 1 is always equal to 1.  For the while loop to stop running forever, the condition has to become false.

Let's take a look at another example. If we execute the following piece of code:

```
int i =0;
while(i<10)
{
  i+=2;
  System.out.println(i);
}
```

The result would be:
```
2
4
6
8
10
```

As we can see the loop runs 5 times. Before the loop starts running, ```i``` is equal to 0. But when we start running the loop for the first time, the variable ```i``` increases by 2, because of the ```i+=2;``` line. Therefore the variable ```i``` becomes 2, and thus it prints 2. The reason why it prints an arithmetic pattern with an incrementation of 2 is that, everytime the loop runs, the value of ```i``` increases by 2(```i+=2;```). Before the loop runs for the fifth time, ```i``` holds the value of 8. But when we run the loop for the 5th time, we add 2 to ```i```, and thus the value of ```i``` becomes 10. But the loop doesn't run for the 6th time because the condition for the loop is ```i<10```. Remember that after we ran the loop for the 5th time, the value of ```i``` was 10. And 10 is not less than 10. Therefore the loop doesn't run anymore because ```10<10``` evaluates to ```false```.   

We can also create an air conditioner program by using while loops:
```
public class AirConditioner 
{
	public static void main(String[]args)
	{
		System.out.println("Welcome to the air conditioner program");
		double rate = .5; //degrees per minute
		int time =0; //in minutes
		double currentTemp = 79;
		double requiredTemp = 71;
		if(requiredTemp>currentTemp)
		{
			while(currentTemp<requiredTemp)//Heating the room because the required temperature is higher than the current temperature
			{
				currentTemp+=rate;
				time++;
			}
			System.out.println("It took " + time + " minutes to heat the room to " + requiredTemp + " degrees Fahrenheit.");
		}
		else if(requiredTemp<currentTemp)//Cooling the room because the required temperature is lower than the current temperature
		{
			while(currentTemp>requiredTemp)
			{
				currentTemp-=rate;
				time++;
			}
			System.out.println("It took " + time + " minutes to cool the room to " + requiredTemp + " degrees Fahrenheit.");
		}
		else //Does nothing because this condition is run only if the required temperature and the current temperature are the same
		{
			System.out.println("Required temperature already met.");
		}
	}
}
```
In this program, we are either heating or cooling the room based on the ```currentTemp``` and the ```requiredTemp``` variable. If the ```requiredTemp``` variable is greater than the ```currentTemp```, we heat the room by incrementing the ```currentTemp``` by ```rate```. The other way around, if the ```requiredTemp``` variable is less than the ```currentTemp```, we cool the room by decrementing the ```currentTemp``` by ```rate```. We calculate the time by increasing 1 to the ```time``` variable, every time the loop runs. The loop stops running when the ```currentTemp``` variable is equal to the ```requiredTemp``` variable. After that, we just print out how much time it took to cool/heat the room the required temperature.

If you would like to learn about while loops from a video, please click [here](https://youtu.be/8ZuWD2CBjgs).
