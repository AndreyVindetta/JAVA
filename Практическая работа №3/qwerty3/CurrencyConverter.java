import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyConverter {
    public static void main(String[] args){
        double dollar, euro;
        DecimalFormat f = new DecimalFormat("#.###");//форматируем передаваемое значение до 3 десятичных знаков
        System.out.print("Введите значение в рублях: ");
        Scanner in = new Scanner(System.in);
        double rubbles = in.nextInt();
        dollar = rubbles / 61.25;
        euro = rubbles / 59.98;
        System.out.print(f.format(dollar) + " dollar\n" + f.format(euro) + " euro\n");
    }
}