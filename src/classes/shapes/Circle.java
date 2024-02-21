package classes.shapes;

public class Circle extends Shape2D {

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    @Override
    protected void name() {

    }

    @Override
        public void draw() {
            System.out.println("( )");
        }

    @Override
    protected double calculateArea() {

        //setRadius();
        return Math.PI * Math.pow(radius, 2);
    }


    @Override
    public void resize() {
        System.out.println("");
    }
}
