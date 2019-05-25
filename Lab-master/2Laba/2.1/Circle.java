public class Circle
{
    private double r;
    private double Pi;

    Circle()
    {
        r = 0;
    }
    public void SetRadius(double r)
    {
        this.r = r;
    }

    public double GetRadius()
    {
        return r;
    }

    public double GetSquare()
    {
        return Math.PI*r*r;
    }
}
