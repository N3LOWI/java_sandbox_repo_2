# Repasos Básicos
## Operarios
```java
x++ = x+1
x++ = ++x
```
## Type casting
```java
double myDouble = 9.78d;
int myInt = (int)myDouble;
```
## Ternarios
```java
int time = 20;
String result = "";

//if statement
if(time < 18){
    result = "Good day.";
} else {
    result = "Good evening.";
}
//can be simplifed as this ternary operation
result = (time < 18)? "Good day." : "Good evening.";

System.out.println(result);
```