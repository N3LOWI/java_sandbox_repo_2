import classes.animals.Bird;
import classes.filehandler.TxtFileMaker;
import classes.shapes.Circle;
import classes.shapes.Cylinder;
import classes.shapes.Rectangle;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        Bird bird = new Bird();


        rectangle.draw();

        cylinder.setHeight(10);
        cylinder.setRadius(3);
        System.out.println("Cylinder surface area : " + cylinder.calculateArea());

        TxtFileMaker TxtFileMake = new TxtFileMaker();
        TxtFileMake.createTextFile();

    }
}