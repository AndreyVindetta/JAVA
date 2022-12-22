import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void random()
    {
        double[] arr = new double[10];
        for (int i = 0; i < 10; i++)
        {
            arr[i] = Math.random();
        }
        System.out.print("\nНеотсортированный массив: ");
        for (int j = 0; j < 10; j++)
        {
            System.out.print(arr[j] + " ");
        }
        System.out.print("\nОтсортированный массив: ");
        Arrays.sort(arr);
        for (int k = 0; k < 10; k++)
        {
            System.out.print(arr[k] + " ");
        }
    }
    public static void Random()
    {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
        {
            arr[i] = rand.nextInt();
        }
        System.out.print("\nНеотсортированный массив: ");
        for (int j = 0; j < 10; j++)
        {
            System.out.print(arr[j] + " ");
        }
        System.out.print("\nОтсортированный массив: ");
        Arrays.sort(arr);
        for (int k = 0; k < 10; k++)
        {
            System.out.print(arr[k] + " ");
        }
    }
    public static void zadanie2(){}
    public static void zadanie3()
    {
        int[] arr=new int[4];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(Math.random()*90+10);
            System.out.print(arr[i]+" ");
        }
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]>=arr[i])
            {
                System.out.println("\nПрогрессия не строго возрастающая");
                break;

            }
            if(i==arr.length-1)
            {
                System.out.println("\nПоследовательность строго возрастающая");
            }
        }
    }
    public static void zadanie4(int n)
    {
        int[] arr = new int[n];
        System.out.print("\nМассив: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.random()*n);
            System.out.print(arr[i] + " ");
        }
        ArrayList<Integer> new_arr = new ArrayList<>();//создание динамического массива с четными элементами из первого массива
        for (int j : arr) {
            if (j % 2 == 0) {
                new_arr.add(j);//добавление нового элемента из старого массива в конец нового массива
            }
        }
        if(new_arr.isEmpty())
        {
            System.out.println("Первый массив не содержал четных значений");
        }
        else
        {
            System.out.print("\nМассив чётных элементов: ");
            for (Integer integer : new_arr) {
                System.out.print(integer + " ");
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println("ЗАДАНИЕ№1");
        random();
        System.out.println();
        Random();
        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ№2");
        zadanie2();
        System.out.println();
        System.out.println("ЗАДАНИЕ№3");
        System.out.println();
        zadanie3();
        System.out.println();
        System.out.println("ЗАДАНИЕ№4");
        int n;
        do
        {
            System.out.print("\nВведите количество элементов массива (натур. число): ");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            if (n < 1)
            {
                System.out.print("Вы ввели не натуральное число. Попробуйте ещё раз.");
            }
        }
        while (n < 1);
        zadanie4(n);
    }
}