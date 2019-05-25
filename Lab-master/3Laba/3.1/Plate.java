public class Plate extends Dish
{
    private String name;
    Plate(String material, double area, String color, int cost, String name)
    {
        super(material,area,color,cost);
        this.name = name;
    }

    public double AreaOfDish()
    {
        return super.GetArea()*super.GetArea()*Math.PI;
    }

    public void InfoOfDish()
    {
        System.out.println("Материал тарелки: "+ super.GetMaterial() + "\n" +
                "Площадь тарелки: " + AreaOfDish() + "\n" +
                "Цвет тарелки: "+super.GetColor() +"\n" +
                "Цена тарелки: "+super.GetCost()+"\n" +
                "Название товара: "+this.name+ "\n");
    }
}
