public class Leg
{
    private int LegLength;
    private int AmountOfFingers;

    public void SetLength(int Length)
    {
        this.LegLength = Length;
    }
    public void SetAmount(int Amount)
    {
        this.AmountOfFingers = Amount;
    }

    public int GetLeg()
    {
        return LegLength;
    }
    public int GetAmount()
    {
        return AmountOfFingers;
    }
}
