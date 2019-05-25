public class Wineglass extends Dish
{
    private String name;
    Wineglass(String material, double area, String color, int cost, String name)
    {
        super(material,area,color,cost);
        this.name = name;
    }

    public double AreaOfDish()
    {
        return super.GetArea()*super.GetArea()*Math.PI*4; //У бокала максимум 4 см глубина
    }

    public void InfoOfDish()
    {
        System.out.println("Материал бокала: "+ super.GetMaterial() + "\n" +
                "Объем бокала: " + AreaOfDish() + "\n" +
                "Цвет бокала: "+super.GetColor() +"\n" +
                "Цена бокала: "+super.GetCost()+"\n" +
                "Название товара: "+this.name+ "\n");
    }
}
