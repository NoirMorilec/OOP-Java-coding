import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Введите переменную для вывода первых n членов последовательности:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int j = 0;
        for (int i = 0; i < n+1; i++)
        {
            while(j<i)
            {
                System.out.print(i+"  ");
                j++;
            }
        j = 0;
        }
    }
}

