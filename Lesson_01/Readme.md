# Lesson_01 #

## Printing ##
Print statements are used to display data onto the java console so that the user can see the output of their code. In Java, we print by saying ```System.out.println();```.

So for example, if you type:
```System.out.println("Hello World!");```

The result would be:
```Hello World!```


An example of when we use print statements in our robot is when we want to test out our encoders and see if they are working.
```
public void testEncoders()
{
	System.out.println("Right encoder value: " + enc.returnrightEncValue());
	System.out.println("Left encoder value: " + enc.returnleftEncValue());
}
```
If you would like to learn how to print from a video, please click [here](https://www.youtube.com/watch?v=l7cf4mT0htE).

## Variables ##
In programming, variables are like a storage location that can contain any type of data. Variables are used so that the stored data can be used on later for doing useful stuff. There are a lot of different types of data that can be stored in a variable. Here are a few examples: 
* ```boolean```: Boolean is a data type that can hold two types of values. ```true``` or ```false```.
* ```byte```: Byte is a data type that can hold integers with a storage capacity of fewer than 8 bits.
* ```int```: Int is a data type that can hold integers with a storage capacity of fewer than 32 bits.
* ```float```: Float is a data type that can hold decimals with a storage capacity of fewer than 32 bits.
* ```double```: Double is a data type that can hold decimals with a storage capacity of fewer than 64 bits.
* ```String```: String is a data type that can hold a sequence of characters.



An example of when we use variables in our robot is when we describe the path of autonomous functions and to determine other function we would like to run during the Tele-operated period.
```
//Variables used for moving robot autonomously
double straightdist = 1900;
double straightDistBR = 1940;
double straightDistRR = 1840;
double bigTurn = 1600;
double smallTurn = 930;
double distanceforGearFromMiddle = 1600;
double backUpDisatnceFromMiddle = 2300;
double goForwToCross = 5000;

//Variables used for conditions in Tele-Op
boolean steeringWheelDrive = false;
int prevState = 0;
String switchWiggle = "left";
```
If you would like to learn about variables from a video, please click [here](https://youtu.be/XX77ZI9E0IE).


## Arithmetic Operations ##
In programming, Arithmetic Operators can be used to perform calculations in a program. Some examples are:
* ```+```: The addition operator is used to add numbers.
* ```-```: The subtraction operator is used to subtract numbers.
* ```*```: The multiplication operator is used to multiply numbers.
* ```/```: The division operator is used to divide numbers.
* ```%```: The remainder operator is used to output the remainder of the quotient.


Here are some examples of when we use operators in our robot program:
```
Motors007.leftTalon.set(((speed+turn)));
Motors007.rightTalon.set(((-speed+turn)));
```

```
turn = .5*(rightValue);
```

```
if(enc.returnrightEncValue()<(smallTurn-170))
```
If you would like to learn about arithmetic operators from a video, please click [here](https://youtu.be/RmFbY14OvdA).
