package classes.shapes;

public class Rectangle extends Shape2D {
    @Override
    protected void name() {
        System.out.println("Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("/___/");
    }

    @Override
    protected double calculateArea() {
        return 0;
    }

    @Override
    public void resize() {
    }

}