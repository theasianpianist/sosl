StackOverflow Search Library

A simple Java library that searches Google and StackOverflow for exceptions that are thrown during runtime

Usage:

```java
import tk.lawrencelee.StackOverflowSearchLib;
```
```java
try {
  //some code that throws an exception
}
catch (Exception e) {
  StackOverflowSearchLib.search(e);
}
```
NOTE: Doesn't work on Linux (and maybe Mac? Can someone with a Mac please test for me) because of poor integration for the Java Desktop API
