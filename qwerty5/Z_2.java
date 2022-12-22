import javax.swing.*;
import java.awt.*;
public class Z_2 extends JFrame{
    public static Shape getRandomShape()
    {
        int rand = (int)(Math.random() * 3);
        switch (rand)
        {
            case 0:
            {
                return new Rectangle();
            }
            case 1:
            {
                return new Circle();
            }
            default:
            {
                return new Square();
            }
        }
    }
    public void paint(Graphics lala)
    {
        super.paint(lala);
        for (int i = 50; i < 800; i = i + 200)
        {
            for (int j = 50; j < 1250; j = j + 250) {
                Shape sh = getRandomShape();
                sh.setXY(j, i);
                int a = (int) (Math.random() * 255);
                int b = (int) (Math.random() * 255);
                int c = (int) (Math.random() * 255);
                sh.setColor(new Color(a, b, c));
                lala.setColor(sh.getColor());
                if (sh.getClass().getSimpleName().equals("Square")) {
                    lala.fillRect(sh.getX(), sh.getY(), 50, 50);
                }
                else if (sh.getClass().getSimpleName().equals("Circle")) {
                    lala.fillOval(sh.getX(), sh.getY(), 200, 200);
                }
                else {
                    lala.fillRect(sh.getX(), sh.getY(), 200, 150);
                }
            }
        }

    }
    public Z_2()
    {
        super("Zadanie_2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200,1000);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Z_2();
    }
}