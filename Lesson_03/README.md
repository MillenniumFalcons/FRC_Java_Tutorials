# Lesson_03 #

## For loops ##
In programming, a for loop is a conditional iterative statement which repeats a section of code known number of times until a certain condition is met.

So for example if you execute the following piece of code:

```
for(int i=1; i<=3; i++)
{
	  System.out.println("Hello World");
}
```
The result will be:
```
Hello World
Hello World
Hello World
```

As you can see, we were able print ```Hello World``` 3 times by using a for loop. Now lets dive into what each component of the for loop does. The ```for``` statement is used to start a for loop. The ```i =0``` part, creates a variable called ```i```. The ```i<=3``` is the condition of the for loop. In other words```System.out.println("Hello World");``` will be executed, until the ```i<=3``` condition becomes ```false```. The ```i++``` part of the code tells the variable ```i``` to increase by 1 every time the piece of code is executed. This means that in this example, the variable ```i``` starts with a value of 1. 

How the actual for loop worked: The first time the piece of code was executed, it prints ```Hello World``` and the value of variable ```i``` becomes 2 from 1, because of the ```i++``` statement. The second time it runs, it prints ```Hello World``` once again and the value of variable ```i``` becomes 3 from 2. The third time it runs, it prints ```Hello World``` one more time, and the value of variable ```i``` becomes 4 from 3. The computer doesn't run the for loop for the 4th time, because the value of ```i``` is 4, and the condition ```i<=3``` becomes false. Since the value of the condition becomes false, the compiler exits the for loop, and the program is completed.

Here are some examples of when we used for loops in our robot program:

## Nested For loops ##
Nested for loops are when loops are within other for loops. An example of this can be found in the lesson file.
