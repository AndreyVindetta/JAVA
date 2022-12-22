import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        System.out.println(Sum(num));
    }
    public static int Sum(int num)
    {
        if(!((num%10) == num))
        {
            return (num%10)+Sum(num/10);
        }
        else
        {
            return num%10;
        }
    }
}
