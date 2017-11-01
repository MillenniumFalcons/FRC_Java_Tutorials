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
The console would just print out ```Hello World``` an infinite amount of times because 1 is always equal to 1.  In order for the while loop to stop running forever, the condition has to become false.

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

As we can see the loop runs 5 times. Before the loop starts running ```i``` is equal to 0. But when we start running the loop for the first time, the variable ```i``` increases by 2, because of the ```i+=2;``` line. Therefore the variable ```i``` becomes 2, and thus it prints 2. The reason why it prints an arithmetic pattern with an incrementation of 2 is that, everytime the loop runs, the value of ```i``` increases by 2(```i+=2;```). Before the loop runs for the fifth time, the value of ```i``` was 8. But when we run the loop for the 5th time, we add 2 to ```i```, and thus the value of ```i``` becomes 10. But the loop doesn't run for the 6th time because the condition for the loop is ```i<10```. Remember that after we ran the loop for the 5th time, the value of ```i``` was 10. And 10 is not less than 10. Therefore the loop doesn't run anymore because ```10<10``` evaluates to ```false```.   



