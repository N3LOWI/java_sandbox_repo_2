package classes;

public class Polymorphism {

    public /*abstract*/ class Animal {
        private String sound = "";
        /*
        public Animal(String sound){
            this.sound = sound;
        }
        */
        public void Sound(String sound){
            System.out.println("Animal sound");
        }
    }

    public class Bird extends Animal {
        private String birdSound = "cui";

        public Bird(String birdSound){
            //super(birdSound);
            this.birdSound = birdSound;
        }

        @Override
        public void Sound(String birdSound){
            System.out.println(birdSound);
        }
    }

    public class Cat extends Animal {
        private String catSound = "miaw";

        public Cat(String catSound){
            //super(catSound);
            this.catSound = catSound;
        }

        @Override
        public void Sound(String catSound){
            System.out.println(catSound);
        }
    }

    // ex 12

    abstract class Shape {

        public abstract void draw();
        public abstract double calculateArea();
    }

    public class Circle extends Shape {
        private double radius;
        @Override
        public void draw(){
            System.out.println("/ \\");
            System.out.println("\\ /");
        }
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    public class Cylinder extends Shape {

        private double radius, height;
        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setHeight(double height) {
            this.height = height;
        }



        @Override
        public void draw(){
            System.out.println("/ \\");
            System.out.println("\\_/");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("\\_/");
        }

        @Override
        public double calculateArea(){
            double baseArea = 2 * Math.PI * Math.pow(radius, 2);
            double lateralArea = 2 * Math.PI * radius * height;
            double surfaceArea = baseArea + lateralArea;
            return surfaceArea;
        }
    }
}
