import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> arrayList;

    static Scanner in = new Scanner(System.in);

    public static void fillList(ArrayList<String> arrayList, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println("Введите строку " + (i+1) + ":");
            arrayList.add(in.nextLine());
        }
    }

    public static boolean isContains(ArrayList<String> arrayList, String search)
    { return arrayList.contains(search); }

    public static void main(String[] args) {
        arrayList = new ArrayList<>();
        System.out.println("Введите количество строчек для заполнения:");
        int amount = in.nextInt();
        in.nextLine();
        System.out.println("Тест ввода строчек в контейнере:");
        fillList(arrayList, amount);
        System.out.println("Тест наличия строки в контейнере.\nВведите строку для проверки:");
        if (isContains(arrayList, in.nextLine())) {
            System.out.println("Данная строка содержится в контейнере");
        } else {
            System.out.println("Данной строки нет");
        }
        System.out.println("Тест удаления из контейнера.\nВведите элемент для удаления:");
        int index = in.nextInt();
        if (index < arrayList.size() & index > -1) {
            arrayList.remove(index);
            System.out.println("Операция удаления выполнена успешно. Теперь контейнер выглядит так:");
            for (String el : arrayList) System.out.println(el);
        } else {
            System.out.println("Под данным индексом строчки на данный момент строчки не существует!");
        }
    }
}
