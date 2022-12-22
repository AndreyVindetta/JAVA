public class Ball
{
    private float x;
    private float y;
    public Ball(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public float getX()
    {
        return x;
    }

    public float getY()
    {
        return y;
    }

    public void setX(float x)
    {
        this.x = x;
    }

    public void setY(float y)
    {
        this.y = y;
    }
    public void setXY(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    public void move(float xDisp, float yDisp)
    {
        x+=xDisp;
        y+=yDisp;
    }

    @Override
    public String toString() {
        return "Ball: " +
                "x =" + x +
                ", y =" + y;
    }
}

