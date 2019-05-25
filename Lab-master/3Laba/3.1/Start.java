import java.util.Scanner;

public class Start
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        System.out.println("\nВведите данные для тарелки: материал, радиус, цвет, стоимость, название товара");
        Plate plate = new Plate(scan.nextLine(),scanInt.nextDouble(),scan.nextLine(),scanInt.nextInt(),scan.nextLine());
        System.out.println("\nВведите данные для миски: материал, радиус, цвет, стоимость, название товара");
        Bowl bowl = new Bowl(scan.nextLine(),scanInt.nextDouble(),scan.nextLine(),scanInt.nextInt(),scan.nextLine());
        System.out.println("\nВведите данные для бокала: материал, радиус, цвет, стоимость, название товара");
        Wineglass glass = new Wineglass(scan.nextLine(),scanInt.nextDouble(),scan.nextLine(),scanInt.nextInt(),scan.nextLine());
        plate.InfoOfDish();
        bowl.InfoOfDish();
        glass.InfoOfDish();
    }
}
