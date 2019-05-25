import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Circle FirstCircle = new Circle();
        System.out.println("Введите радиус окружности: ");
        Scanner scan = new Scanner(System.in);
        double r = scan.nextFloat();
        FirstCircle.SetRadius(r);
        System.out.println("Теперь круг имеет радиус " + FirstCircle.GetRadius() +". А площадь такого круга примерно равна " + FirstCircle.GetSquare());
    }
}
