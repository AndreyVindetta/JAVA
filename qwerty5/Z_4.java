import javax.swing.*;
public class Z_4 extends Anime{
    public static void main(String[] args) {
        new Anime();
        framlist.add(new ImageIcon("C:\\Users\\Andre\\OneDrive\\Документы\\4T2o").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Andre\\OneDrive\\Документы\\6vw5").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Andre\\OneDrive\\Документы\\2GU").getImage());
        Anime animImg = new Anime();
        while (true)
        {
            for (int i = 0; i < 3; i++)
            {
                image = framlist.get(i);
                animImg.repaint();
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException a)
                {
                    a.printStackTrace();
                }
            }
        }
    }
}