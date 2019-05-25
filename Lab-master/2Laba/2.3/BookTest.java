import java.util.Scanner;

public class BookTest
{
    public static void main(String[] args)
    {
        Book obj = new Book();
        System.out.println("Введите автора книги:");
        Scanner scan = new Scanner(System.in);
        obj.SetAutor(scan.nextLine());
        System.out.println("Введите название книги:");
        scan = new Scanner(System.in);
        obj.SetName(scan.nextLine());
        System.out.println("Введите год написания книги:");
        scan = new Scanner(System.in);
        obj.SetYear(scan.nextInt());
        System.out.println("Введите жанр книги:");
        scan = new Scanner(System.in);
        obj.SetType(scan.nextLine());

        System.out.println("\nА теперь выведем все данные об этой книге:\n"+
                "Автор книги: "+obj.GetAutor()+"\n"+
                "Название книги: "+obj.GetName()+"\n"+
                "Год написания книги: "+obj.GetYear()+"\n"+
                "Жанр книги: "+obj.GetType());
    }
}
