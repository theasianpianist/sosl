StackOverflow Search Library

A simple Java library that searches Google and StackOverflow for exceptions that are thrown during runtime.

A pre-built JAR is included in the /target directory in case you don't want to build your own.

Usage:

```java
import tk.lawrencelee.sosl;
```
```java
try {
  //some code that throws an exception
}
catch (Exception e) {
  StackOverflowSearchLib.search(e);
}
```
NOTE: Doesn't work on Linux because of poor integration with the Java Desktop API
