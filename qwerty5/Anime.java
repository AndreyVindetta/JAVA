import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Anime extends JFrame {
    protected static Image image;
    private static JFrame jFrame;
    private static String text;
    protected static ArrayList<Image> framlist = new ArrayList<>();
    Anime(){
        super("Z_4");
        setLayout(new FlowLayout());
        setSize(466,466);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.drawImage(image,0,0, 466, 466, null);
    }
}
