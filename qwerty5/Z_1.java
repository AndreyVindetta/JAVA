import java.awt.*; //исходная платформо-независимая оконная библиотека графического интерфейса языка Java
import java.awt.event.ActionEvent; //Семантическое событие, которое указывает на то, что произошло определенное компонентом действие
import java.awt.event.ActionListener; //Интерфейс прослушивателя для получения событий действия
import javax.swing.*; //Библиотека для создания графического интерфейса
public class Z_1 {
    private static int Milan = 0;
    private static int Madrid = 0;
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Таблица счета"); //что у нас высвечивается при появлении окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //реакция окна на закрытие
        frame.setSize(100,100); //размер окна в пикселях
        JPanel panel = new JPanel(); //основная панель
        panel.setBackground(Color.darkGray); //цвет панели
        panel.setPreferredSize(new Dimension(500,500)); //размер панели
        //создание двух кнопок с названием на них
        JButton Button1 = new JButton("AC Milan");
        JButton Button2 = new JButton("Real Madrid");
        //определяем цвет кнопок
        Button1.setBackground(Color.gray);
        Button2.setBackground(Color.gray);
        //добавляем кнопки на панель
        panel.add(Button1);
        panel.add(Button2);
        //текст
        JLabel label1 = new JLabel("Result: "+Milan+" X "+Madrid, JLabel.CENTER);
        JLabel label2 = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        JLabel label3 = new JLabel("Winner: DRAW", JLabel.CENTER);
        label1.setForeground(Color.white);
        label2.setForeground(Color.white);
        label3.setForeground(Color.white);
        //добавляем текст на панель
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        frame.getContentPane().add(panel); //добавляем панель к фрейму
        frame.pack(); //упакуем во фрейм
        frame.setVisible(true);
        ActionListener a1 = new ActionListener()
        {
            public void actionPerformed(ActionEvent qwerty)
            {
                Milan++;
                label1.setText("Result: "+Milan+" X "+Madrid);
                label2.setText("Last Scorer: Milan");
                if (Milan > Madrid)
                {
                    label3.setText("Winner: Milan");
                }
                else if (Milan == Madrid)
                {
                    label3.setText("Winner: DRAW");
                }
            }
        };
        ActionListener a2 = new ActionListener() {
            public void actionPerformed(ActionEvent qwerty) {
                Madrid++;
                label1.setText("Result: "+Milan+" X "+Madrid);
                label2.setText("Last Scorer: Madrid");
                if (Milan < Madrid)
                {
                    label3.setText("Winner: Madrid");
                }
                else if (Milan == Madrid)
                {
                    label3.setText("Winner: DRAW");
                }
            }
        };
        Button1.addActionListener(a1);
        Button2.addActionListener(a2);
    }
}