import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите число, определяющее количество данных для записи в файл:");

        int value = in.nextInt();
        in.nextLine();

        for (int i = 0; i<value;++i)
        {
            try
            {
                System.out.println("Введите строку");
                String str = in.nextLine();
                FileWriter fin;
                fin  = new FileWriter("NewFile.txt", true);
                fin.write(str);
                fin.write("\r\n");
                fin.flush();
            } catch (IOException e)
            {
                System.out.println(e.toString());
            }
        }
    }
}
