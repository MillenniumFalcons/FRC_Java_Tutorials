# Lesson_01 #

## Printing ##
Print statements are used to display data on to the java console, so that the user can see the output of their code. In java we print by saying ```System.out.println();```.

So for example, if you type:
```System.out.println("Hello World!");```

The result would be:
```Hello World!```


An example of when we use print statements in our robot, is when we want to test out our encoders and see if they are working.
```
public void testEncoders()
{
	System.out.println("Right encoder value: " + enc.returnrightEncValue());
	System.out.println("Left encoder value: " + enc.returnleftEncValue());
}
```

## Variables ##
