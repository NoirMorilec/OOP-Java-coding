public abstract class Dish
{
    private String material;
    private double area;
    private String color;
    private int cost;

    public void SetMaterial(String name)
    { this.material = name; }
    public void SetArea(double value)
    { this.area = value; }
    public void SetColor(String name)
    { this.color = name; }
    public void SetCost(int value)
    { this.cost = value; }


    public String GetMaterial()
    { return this.material;}
    public double GetArea()
    {return this.area;}
    public String GetColor()
    {return this.color;}
    public int GetCost()
    {return this.cost;}

    public abstract void InfoOfDish();
    public abstract double AreaOfDish();


    Dish(String material, double area, String color, int cost)
    {
        this.material = material;
        this.area = area;
        this.color = color;
        this.cost = cost;
    }
}
