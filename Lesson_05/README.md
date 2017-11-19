# Lesson_05 #

## Methods ##
The method is a set of code that can be referred to by a name at any point of the program. You can think of a method as a subprogram that contains code, and only runs that piece of code if called. Note: Methods and functions are the same thing, they are just 2 different terms that mean the same thing.
There are 2 types of methods: return methods and void methods. 

## Return Methods ##
In programming, return methods are methods that return a data type value. In Java (and most other languages), the return type must be explicitly specified when declaring a function. 
So if you would like to create a function that returns a boolean, you would state ```public static boolean functionName()```. Note that the function we create needs to be static for us to be able to use it in the ```main()``` method. Static means that it is accessible to all instances of that class.  Here are some examples of return functions.
* Boolean: The result will be ```false```
```
public static void main(String[]args)
{
	System.out.println(returnBoolean());
}
public static boolean returnBoolean()
{
	return false;
}
```
* String: The result will be ```Hello World!```
```
public static void main(String[]args)
{
	System.out.println(returnString());
}
public static String returnString()
{
	return "Hello World!";
}
```
*Int: The result will be ```23```
```
public static void main(String[]args)
{
	System.out.println(returnInt());
}
public static int returnInt()
{
	return 23;
}
```
*Double: The result will be ```23.0```
```
public static void main(String[]args)
{
	System.out.println(returnDouble());
}
public static double returnDouble()
{
	return 23;
}
```

You could also do calculations and other duties in the return function by using parameters. Parameters are used to pass on values of variables from one method to another. Parameters are the variables/data you enter in the pyranthesis of the method. In this case you would pass the values from the ```main()``` method to the function we are writing. Here are some examples:
* Add 2 numbers together by using the ```addNumbers()``` function: This would produce the sum of the variable ```numOne``` and ```numTwo```, which in this case would produce ```7.0```. 
```
public static void main(String[]args)
{
	double numOne = 2;
	double numTwo = 5;
	System.out.println(addNumbers(numOne, numTwo));
}
public static double addNumbers(double firstNum, double secondNum)
{
	double sum; 
	sum = firstNum + secondNum;
	return sum;
}
```
* Calculate the area of a rectangle by using the ```calcArea()``` function: This would produce the area of the rectangle from the variable ```length``` and ```width```, which in this case would output ```The area of the rectangle which has the length of 4.0 and the width of 7.0 is 28.0.```.
```
public static void main(String[]args)
{
	double length = 4;
	double width = 7;
	double area = calcArea(length, width);
	System.out.println("The area of the rectangle which has the length of " + length + " and the width of " + width + " is " + area + ".");
}
public static double calcArea(double l, double w)
{
	double a; 
	a = l * w;
	return a;
}
```

## Static Variables and Void Methods ##
Static variables are variables that are declared as static outside the main method (or any method) and are usable in any method. Here is how it would look in the code:
```
static int var;
public static void main(String[]args)
{

}
public static void test()
{

}
```
In this scenario, the variable ```var``` can be accessible in both the ```main()``` and the ```test()``` function.

This concept is beneficial when we are trying to make changes to the variable in several functions. For instance:
```
static int var = 5;
public static void main(String[]args)
{
	decreaseByOne();
	System.out.println(var);
}
public static void decreaseByOne()
{
	var--;
}
```
If you run this piece of code, the result will be ```4```. Initially, the value of the variable ```var``` is 5. However, since we call the ```decreaseByOne()``` function it decreases the value of ```var``` by one because we subtracted one off of the value of one: ```var--;```.
However, if we don't call the ```decreaseByOne()``` function:
```
static int var = 5;
public static void main(String[]args)
{
	System.out.println(var);
}
public static void decreaseByOne()
{
	var--;
}
```
The result will be ```5```. Since we don't call the ```decreaseByOne()``` function, it never runs the piece of code in that method, and the value of the variable ```var``` remains the same.

Please see the [Lessons File](https://github.com/MillenniumFalcons/FRC_Java_Tutorials/blob/master/Lesson_05/VoidFunctions/Lessons/voidFunctions.java) for a more adavanced example.

If you would like to learn about methods from a video, please click [here](https://youtu.be/eBodvWUy2NQ).
