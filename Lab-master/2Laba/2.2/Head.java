public class Head
{
    private int SizeOfHead;
    private String ColorOfHairs;
    private boolean Bald;

    public void SetHead(int size)
    {
        this.SizeOfHead = size;
    }
    public void SetBald(boolean bool)
    {
        this.Bald = bool;
    }
    public void SetColor(String color)
    {
        this.ColorOfHairs = color;
    }


    public boolean GetBald()
    {
        return Bald;
    }
    public int GetHead()
    {
        return this.SizeOfHead;
    }
    public String GetColor()
    {
        return this.ColorOfHairs;
    }

}
