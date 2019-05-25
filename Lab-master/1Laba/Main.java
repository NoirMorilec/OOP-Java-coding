package FirstPackage1;

import javax.swing.plaf.FontUIResource;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final int N = 10;
        float[] arr = new float[N];

        for (int i = 0; i<N; i++)
        {
            arr[i] = 0;
        }

        int value = -1;
        do
        {
            System.out.println("Введите цифру для выполнения определенной операции:\n" +
                    "1. Вывести на экран сумму чисел массива с помощью циклов for,while, do while\n" +
                    "2. Вывести на экран аргументы командной строки в цикле for\n" +
                    "3. Вывести на экран первые 10 чисел гармонического ряда\n" +
                    "4. Сгенерировать массив целых чисел, вывести на экран, отсортировать и снова вывести\n" +
                    "5. Создать метод, вычисляющий факториал числа\n" +
                    "0. Выход");

            Scanner scan = new Scanner(System.in);
            value = scan.nextInt();
            switch(value)
            {
                case 1:
                    MyStaticClass.FirstFunc(N,arr);
                    break;
                case 2:
                    MyStaticClass.SecondFunc(args);
                    break;
                case 3:
                    MyStaticClass.ThirdFunc();
                    break;
                case 4:
                    MyStaticClass.FourthFunc(N,arr);
                    break;
                case 5:
                    System.out.println("Введите ваше число");
                    Scanner num = new Scanner(System.in);
                    int n = num.nextInt();
                    MyStaticClass.FifthFunc(n);
                    break;
            }
        }while(value != 0);
    }
}
