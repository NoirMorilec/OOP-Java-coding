public class Bowl extends Dish
{
    private String name;
    Bowl(String material, double area, String color, int cost, String name)
    {
        super(material,area,color,cost);
        this.name = name;
    }

    public double AreaOfDish()
    {
        return super.GetArea()*super.GetArea()*Math.PI*20; //20 см - это глубина миски. У бокала же максимум 4 см
    }

    public void InfoOfDish()
    {
        System.out.println("Материал миски: "+ super.GetMaterial() + "\n" +
                "Объем миски: " + AreaOfDish() + "\n" +
                "Цвет миски: "+super.GetColor() +"\n" +
                "Цена миски: "+super.GetCost()+"\n" +
                "Название товара: "+this.name + "\n");
    }
}
