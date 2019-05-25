import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main{

    Random rnd = new Random();
    public static void main(String[] args) {
        System.out.println("Введите 3 студентов для дальнейших действий:\n");
        Student[] group = new Student[3];
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < group.length; i++) {
            try
            {
                group[i] = new Student(i, buffer.readLine());
            } catch (IOException exc) {
                System.out.println("Ошибка ввода!");
            }
        }

        group[0].id = 9;
        group[1].id = 12;
        group[2].id = 11;

        for (int i = 0; i < group.length; i++) {
            for (int j = 1; j < group.length - i; j++) {
                if (Student.compare(group[j-1], group[j]) <0){
                    Student tmp_st = new Student();
                    tmp_st = group[j-1];
                    group[j-1] = group[j];
                    group[j] = tmp_st;
                }
            }
        }

        for (int i = 0; i < group.length; i++) {
            System.out.println(group[i].name+" "+group[i].id);
        }
    }
}

