import java.lang.*;
import java.util.Scanner;
public class TestBall
{
    public static void main(String[] args)
    {
        Ball b1 = new Ball(12.12f, 123.12f);
        System.out.println(b1);
        Scanner in = new Scanner(System.in);
        System.out.println("На сколько вы хотите изменить параметр x? ");
        float xDisp = in.nextFloat();
        System.out.println("На сколько вы хотите изменить параметр y? ");
        float yDisp = in.nextFloat();
        b1.move(xDisp, yDisp);
        System.out.println(b1);
    }
}