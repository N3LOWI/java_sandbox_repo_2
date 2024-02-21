package classes.shapes;

public class Cylinder extends Shape2D {

    private double radius, height;
    public void setRadius(double radius) { this.radius = radius; }
    public void setHeight(double height) { this.height = height; }


    @Override
    protected void name() { System.out.println("Cylinder"); }

    @Override
    public void draw(){
        System.out.println("( )_____)");

    }

    @Override
    public double calculateArea(){
        double baseArea = 2 * Math.PI * Math.pow(radius, 2);
        double lateralArea = 2 * Math.PI * radius * height;
        double surfaceArea = baseArea + lateralArea;
        return surfaceArea;
    }

    @Override
    protected void resize() {}
}
