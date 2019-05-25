public class Book
{
    private String autor;
    private String name;
    private int year;
    private String TypeOf;

    public void SetAutor(String autor)
    {
        this.autor = autor;
    }
    public void SetName(String name)
    {
        this.name = name;
    }
    public void SetYear(int year)
    {
        this.year = year;
    }
    public void SetType(String type)
    {
        this.TypeOf = type;
    }


    public String GetAutor()
    {
        return autor;
    }
    public String GetName()
    {
        return name;
    }
    public int GetYear()
    {
        return year;
    }
    public String GetType()
    {
        return TypeOf;
    }
}
