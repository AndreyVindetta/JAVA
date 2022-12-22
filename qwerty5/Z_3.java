import javax.swing.*;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException; //исключение ввода вывода
import java.util.Scanner;
import javax.imageio.ImageIO;
public class Z_3 extends JFrame{
    public Z_3(String a) throws IOException{
        super("Z_3");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        BufferedImage img = ImageIO.read(new File(a));
        JLabel label = new JLabel(new ImageIcon(img));
        add(label);
    }
    public static void main(String[] args) throws IOException {
        Scanner a = new Scanner(System.in);
        new Z_3(a.nextLine()).setVisible(true);
    }
}