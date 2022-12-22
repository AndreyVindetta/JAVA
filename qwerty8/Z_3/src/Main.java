import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 1-ое число: ");
        int num = in.nextInt();
        Scanner on = new Scanner(System.in);
        System.out.print("Введите 2-ое число: ");
        int nam = on.nextInt();
        if(num < nam) {
            for(int i = num; i <= nam; i++){
                System.out.print(i);
            }
        }
        else if(num > nam){
            for(int i = num; i >= nam; i--){
                System.out.print(i);
            }
        }
    }
}
