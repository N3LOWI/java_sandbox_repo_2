# Java OOP 
- Encapsulation : <br>
The fact of using classes
- Inheritance : <br>
Parent-Child classes, extending classes, superclasses
- Polymorphysm : <br>
Overloading + Overriding <br>

## Polymorphysm
- Overload
```java
public class Shape {
        //getArea method
        //Expects int area, returns area
        public int getArea(int area){
            return area;
        }
        //Overload of getArea method
        //Now expects double area, returns area
        public double getArea(double area){
            return area;
        }
        //Yet another Overload of getArea method
        //Expects nothing, returns 0
        public double getArea(){
            return 0;
        }
    }
```
- Override
```java
public class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width){
            this.length = length;
            this.width = width;
        }
        
        //Override of getArea method, inside Rectangle class
        @Override
        public double getArea(){
            return length * width;
        }
    }
```
