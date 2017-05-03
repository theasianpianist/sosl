StackOverflow Search Library

Update 2.0: Try/catch blocks are no longer needed, you can now set the default exception handler to an instance of this class.

A simple Java library that searches Google and StackOverflow for exceptions that are thrown during runtime.

A pre-built JAR is included in the /target directory in case you don't want to build your own.

Usage: Simply import the library, then set the default exception handler to a new instance of the class, as shown below.

```java
import tk.lawrencelee.sosl;
```
```java
public static void main(String[] args) {
	Thread.setDefaultUncaughtExceptionHandler(new sosl());
	//Rest of your code
}
```
NOTE: Doesn't work on Linux because of poor integration with the Java Desktop API
