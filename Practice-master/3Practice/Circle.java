public class Circle extends Shape{
    protected double radius;
    public Circle(){
        radius = 5.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override //Перегрузка метода из родительского класса
    public double getArea() {
        return radius * radius * PI;
    }
    @Override //Перегрузка метода из родительского класса
    public double getPerimeter() {
        return 2 * PI * radius;
    }
    @Override //Перегрузка метода из родительского класса
    public String toString(){
        return "A circle with " + this.radius + " radius\n";
    }
}

