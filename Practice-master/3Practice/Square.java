public class Square extends Rectangle {
    protected double side;
    public Square(){
        side = 5.0;
    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override //Перегрузка метода из родительского класса
    public void setWidth(double side){
        width = side;
    }
    @Override //Перегрузка метода из родительского класса
    public void setLength(double side){
        length = side;
    }
    @Override //Перегрузка метода из родительского класса
    public String toString(){
        return "A shape with " + this.width + " width and "+ this.length + " length\n" +
                "This is а square";
    }
}

