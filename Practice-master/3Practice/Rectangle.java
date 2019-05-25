public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        width = 5.0;
        length = 5.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override //Перегрузка метода из родительского класса
    public double getArea() {
        return width * length;
    }
    @Override //Перегрузка метода из родительского класса
    public double getPerimeter() {
        return 2 * (width + length);
    }
    @Override //Перегрузка метода из родительского класса
    public String toString() {
        return "A rectangle with " + this.width + " width and "+ this.length + " length\n";
    }
}

