public class Hand {
    private int ArmLength;
    private int AmountOfFingers;

    public void SetLength(int Length)
    {
        this.ArmLength = Length;
    }
    public void SetAmount(int Amount)
    {
        this.AmountOfFingers = Amount;
    }


    public int GetLength()
    {
        return ArmLength;
    }
    public int GetAmount()
    {
        return AmountOfFingers;
    }
}
