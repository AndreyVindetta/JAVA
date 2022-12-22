import java.awt.Color;//используется для инкапсуляции цветов в цветовом пространстве sRGB
abstract public class Shape {
    protected Color color;
    protected int x = 0;
    protected int y = 0;

    public Color getColor()
    {
        return this.color;
    }
    public void setColor(Color color)
    {
        this.color = color;
    }

    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}