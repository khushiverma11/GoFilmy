import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hello extends JFrame implements ActionListener {
    JFrame f1;
    JLabel l1, l2, l3, l4, l5;
    JButton b1,b2,b3,b4,b5,b6;

    hello() {
        f1 = new JFrame("Book_My_Show");
        l1 = new JLabel("Movies");
        l1.setBounds(50, 50, 150, 50);
        //l1.setBackground(Color.red);
        l1.setVerticalAlignment(JLabel.CENTER);
        l2 = new JLabel("Shows");
        l2.setBounds(150, 50, 150, 50);
        l3 = new JLabel("events");
        l3.setBounds(250, 50, 150, 50);
        l4 = new JLabel("recommended Movies");
        l4.setBounds(350, 50, 150, 50);
        l5 = new JLabel("");
        l5.setBounds(350, 50, 150, 50);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);
        f1.setSize(900, 900);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f1.getContentPane().setBackground(Color.blue);
        setButton();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void setButton()
    {
        b1 = new JButton(new ImageIcon("//Users/khushiverma/Downloads/bhola-4.png"));
        b1.setBounds(50, 200, 150, 300);
        b2 = new JButton(new ImageIcon("//Users/khushiverma/Downloads/kk.png"));
        b2.setBounds(250, 200, 150, 300);
        b3 = new JButton(new ImageIcon("/Users/khushiverma/Desktop/gg.png"));
        b3.setBounds(450, 200, 150, 300);
        b4 = new JButton(new ImageIcon("/Users/khushiverma/Desktop/ff.png"));
        b4.setBounds(650, 200, 150, 300);
        b5 = new JButton(new ImageIcon("/Users/khushiverma/Desktop/ps.png"));
        b5.setBounds(850, 200, 150, 300);
        b6 = new JButton(new ImageIcon(""));
        b6.setBounds(850, 200, 150, 300);
        f1.add(b1);
        b1.addActionListener(this);
        f1.add(b2);
        b2.addActionListener(this);
        f1.add(b3);
        b3.addActionListener(this);
        f1.add(b4);
        b4.addActionListener(this);
        f1.add(b5);
        b5.addActionListener(this);
        f1.add(b6);
    }
    public void actionPerformed(ActionEvent aa)
    {
        if (aa.getSource() == b1) {
            int a = JOptionPane.showConfirmDialog(f1, "About the movie: ", "Continue?", JOptionPane.YES_NO_OPTION);
            if (a == JOptionPane.YES_OPTION) {
                NewPage p1 = new NewPage();
                p1.setVisible(true);
            }
        }
            else if (aa.getSource() == b2) {
                int b = JOptionPane.showConfirmDialog(f1, "About the movie: ", "Continue?", JOptionPane.YES_NO_OPTION);
                if (b == JOptionPane.YES_OPTION)
                {
                    gumrah g = new gumrah();
                    g.setVisible(true);
                }
            }
            else if (aa.getSource()==b3)
            {
                int c = JOptionPane.showConfirmDialog(f1, "About the movie: ", "Continue?", JOptionPane.YES_NO_OPTION);
                if (c == JOptionPane.YES_OPTION)
                {
                    gotg g1 = new gotg();
                    g1.setVisible(true);
                }
            }
            else if (aa.getSource()==b4)
            {
                int d = JOptionPane.showConfirmDialog(f1, "About the movie: ", "Continue?", JOptionPane.YES_NO_OPTION);
                if (d == JOptionPane.YES_OPTION)
                {
                    fastandfurious g2 = new fastandfurious();
                    g2.setVisible(true);
                }
            }
            else if (aa.getSource()==b5)
            {
                int e = JOptionPane.showConfirmDialog(f1, "About the movie: ", "Continue?", JOptionPane.YES_NO_OPTION);
                if (e == JOptionPane.YES_OPTION)
                {
                    PS2 g3 = new PS2();
                    g3.setVisible(true);
                }
            }
        }


    public static void main(String []aa)
    {
        try
        {
          new hello();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

