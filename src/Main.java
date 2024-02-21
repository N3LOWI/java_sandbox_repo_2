import classes.Polymorphism;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Polymorphism polymorphism = new Polymorphism();
        Polymorphism.Cylinder cylinder = polymorphism.new Cylinder();
        Polymorphism.Circle circle = polymorphism.new Circle();

        cylinder.setHeight(10);
        cylinder.setRadius(3);
        System.out.println("Cylinder surface area" + cylinder.calculateArea());
    }
}