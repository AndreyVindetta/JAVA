import java.lang.*;
import java.util.Scanner;
public class TestAuthor
{
    public static void main(String[] args)
    {
    Author a1 = new Author("Ray Bradbury", "RayBradbury@yandex.ru", 'M');
    System.out.println(a1);
    Scanner in = new Scanner(System.in);
    System.out.println("Введите email автора: ");
    String email = in.nextLine();
    a1.setEmail(email);
    System.out.println(a1);
    }
}