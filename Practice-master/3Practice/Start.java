public class Start {
    public static void main(String[] args) {

        Shape s1 = new Circle(5, "Белый", false);
        System.out.println(s1);
        System.out.println("Площадь: " + s1.getArea());
        System.out.println("Периметр: " + s1.getPerimeter());
        System.out.println("Цвет: " + s1.getColor());
        System.out.println("Заполненный: " + s1.isFilled());
        System.out.println("Радиус: " + ((Circle) s1).getRadius());

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println("Площадь: " + c1.getArea());
        System.out.println("Периметр: " + c1.getPerimeter());
        System.out.println("Цвет: " + c1.getColor());
        System.out.println("Заполненный: " + c1.isFilled());
        System.out.println("Радиус: " + c1.getRadius());
        System.out.println();

        Shape s3 = new Rectangle(1, 3.0, "Фиолетовый", false);
        System.out.println(s3);
        System.out.println("Площадь: " + s3.getArea());
        System.out.println("Периметр: " + s3.getPerimeter());
        System.out.println("Цвет: " + s3.getColor());
        System.out.println("Длина: " + ((Rectangle) s3).getLength());
        System.out.println();

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println("Площадь: " + r1.getArea());
        System.out.println("Цвет: " + r1.getColor());
        System.out.println("Длина: " + r1.getLength());
        System.out.println();

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println("Площадь: " + s4.getArea());
        System.out.println("Цвет: " + s4.getColor());
        System.out.println("Сторона: " + ((Square) s4).getSide());
        System.out.println();

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println("Площадь: " + r2.getArea());
        System.out.println("Цвет: " + r2.getColor());
        System.out.println("Длина: " + r2.getLength());
        System.out.println();

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println("Площадь: " + sq1.getArea());
        System.out.println("Цвет: " + sq1.getColor());
        System.out.println("Сторона: " + sq1.getSide());
        System.out.println("Длина: " + sq1.getLength());
    }
}

