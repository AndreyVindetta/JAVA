public class Square extends Shape{
    private int length = 100;
    public Square()
    {
    }
    public Square(int length)
    {
        this.length = length;
    }
    public void setWidth(int length)
    {
        this.length = length;
    }
    public int getWidth()
    {
        return length;
    }
}
