import java.util.Scanner;
public class Main
{
    public static int Sum(int k, int s,int length,int sum) {
        if(length == k)
        {
            if(sum == s)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        int c = (length == 0 ? 1 : 0);
        int result =0;
        for (int i = c; i < 10; i++) {
            result += Sum(k, s, length + 1,sum + i);
        }
        return result;
    }
    public static void main(String[] args) {
        Main n = new Main();
        System.out.println(n.Sum(3, 3,0,0));
    }
}