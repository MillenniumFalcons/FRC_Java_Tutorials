# Lesson_02 #
## Conditional Statements ##
### If and Else statements ###
In programming, conditional statements support decisions depending on if a certain condition is met or not. So for example, if you state:
```
boolean iAmAwesome = true;
if(iAmAwesome)
{
  System.out.println("I am awesome");
}
else
{
  System.out.println("I guess, I'm not that awesome");
}
```
The result will be: ```I am awesome```. But you can also see that your result totally relies on the ```iAmAwesome``` variable. If you set the variable to false: ```boolean iAmAwesome = false```, the result will change to ```I guess, I'm not that awesome```.

If you would like to learn about if and else statements from a video, please click [here](https://youtu.be/iMeaovDbgkQ).
### Else If statements ###
There is also something called an ```else if``` statement. We usually use an else if statement when there are more than 2 conditions. We usually use ```else if```s to specify a new condition to test, if the first condition is false. For example: 
```
if(condition)
{
  //executed only if "condition" is true
}
else if (other condition)
{
  //executed only if "condition" was false and "other condition" is true
}
else
{
  //executed only if both "condition" and "other condition" were false
}
```

An example of when we use conditional statements in our robot is when we want to determine the clamp status of the robot using the variable ```joyStickValue```.
```
if(joyStickValue)
{
	unClampThePiston();
}
else
{
	clampThePiston();
}
```

If you would like to learn about else if statements from a video, please click [here](https://youtu.be/C0YRYVn_BeI).

## Relational and Logical Operators ##
Relational and Logical Operators are operators used to manipulate and compare variables. Here are some examples: 
* ```==``` The equals to operator is to check if the value of 2 variables are equal or not, if yes then the condition becomes true
* ```!=``` The not equals to operator is to check if the value of 2 variables are not equal or equal, if they are not equal then the condition becomes true
* ```>``` The greater than operator is to check if the value of the left variable is greater than the right variable, if yes then the condition becomes true
* ```>=``` The greater than or equal to operator is to check if the value of the left variable is greater than or equal to the right variable, if yes then the condition becomes true
* ```<``` The less than operator is to check if the value of the left variable is less than the right variable, if yes then the condition becomes true
* ```<=``` The less than or equal to operator is to check if the value of the left variable is less than or equal to the right variable, if yes then the condition becomes true
* ```&&``` The logical AND operator is used to check if 2 or more conditions are satisfied at the same time, if yes then the condition becomes true
* ```||``` The logical OR operator is used to check if either one of more than many conditions are satisfied at the same time, if yes then the condition becomes true
* ```!``` The logical NOT  operator is used to reverse a logical state of a condition.

If you would like to learn about relational and logical operators from a video, please click [here](https://youtu.be/W-JvzG_prfg).
