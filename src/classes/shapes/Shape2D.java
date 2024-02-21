package classes.shapes;
abstract class Shape2D {


    //Abstract methods, child classes must implement.
    protected abstract void name();
    protected abstract void draw();
    protected abstract double calculateArea();
    protected abstract void resize();
}

