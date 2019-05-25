import java.util.Scanner;

public class Start
{
    public static String IsBald(Human obj)
    {
        if (obj.head.GetBald()==true)
        {
            return "Лысый";
        }
        else
        {
            return obj.head.GetColor();
        }
    }
    public static void ClassOut(Human obj)
    {
        System.out.println("Вывод всех свойств данного человека:\n" +
                "Голова:\n" +
                "\tРазмер в см: "+obj.head.GetHead()+"\n"+
                "\tЦвет волос: "+IsBald(obj)+"\n"+
                "Рука:" +"\n"+
                "\tДлина руки:"+obj.hand.GetLength() +"\n"+
                "\tКоличество пальцев на руке: "+obj.hand.GetAmount()+"\n"+
                "Нога:"+"\n"+
                "\tДлина ноги:"+obj.leg.GetLeg()+"\n"+
                "\tКоличество пальцев на ноге: "+ obj.leg.GetAmount());
    }
    public static void main(String[] args)
    {
        Human obj = new Human();
        System.out.println("Введите размер головы в см:");
        Scanner scan = new Scanner(System.in);
        obj.head.SetHead(scan.nextInt());
        System.out.println("Лысый ли человек? true - да, лысый/false - нет, c волосами:");
        scan = new Scanner(System.in);
        obj.head.SetBald(scan.nextBoolean());
        if (obj.head.GetBald() == true)
        {
            obj.head.SetColor("None");
        }
        else
        {
            System.out.println("Введите цвет волос:");
            scan = new Scanner(System.in);
            obj.head.SetColor(scan.nextLine());
        }

        System.out.println("Теперь опишите свойства руки. Какова длина и сколько пальцев?\nДлина:");
        scan = new Scanner(System.in);
        obj.hand.SetLength(scan.nextInt());
        System.out.println("Кол-во пальцев:");
        scan = new Scanner(System.in);
        obj.hand.SetAmount(scan.nextInt());


        System.out.println("Теперь опишите свойства ноги. Какова длина и сколько пальцев?\nДлина:");
        scan = new Scanner(System.in);
        obj.leg.SetLength(scan.nextInt());
        System.out.println("Кол-во пальцев:");
        scan = new Scanner(System.in);
        obj.leg.SetAmount(scan.nextInt());

        ClassOut(obj);
    }
}
