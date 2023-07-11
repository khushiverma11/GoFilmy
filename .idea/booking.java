import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class booking extends JFrame implements ActionListener {
    JFrame f1;
    JLabel l1,l2,l3,l4;
    JButton b1,b2,b3;
    booking() {
        f1 = new JFrame("WELCOME");
        l1 = new JLabel("BOOK_MY_SHOW");
        l1.setFont(new Font("Serif", Font.BOLD, 14));
        l1.setBounds(250, 150, 150, 50);
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l2=new JLabel("MADE_BY_KHUSHI_VERMA",JLabel.RIGHT);
        l2.setVerticalAlignment(JLabel.BOTTOM);
        b1=new JButton("ALREADY A CUSTOMER?");
        b1.setBounds(100,200,200,50);
        f1.setBackground(Color.CYAN);
        b2=new JButton("NEW HERE: SIGN UP");
        b2.setBounds(300,200,200,50);
        b3=new JButton("");
        b3.setBounds(300,200,200,50);
        l3=new JLabel("Endless Entertainment Anytime, Anywhere");
        l3.setBounds(200,300,300,50);
        l3.setBackground(Color.BLUE);
        l4=new JLabel("");
        l4.setBounds(200,300,300,50);
        //ImageIcon i = new ImageIcon("/Users/khushiverma/Desktop/movie.png");
        //l5 = new JLabel(i,JLabel.CENTER);
        ImageIcon icon = new ImageIcon("/Users/khushiverma/Desktop/movie.png");
        //l5.setVerticalAlignment(JLabel.TOP);
        JOptionPane.showMessageDialog(null, "Endless Entertainment Anytime, Anywhere", "BOOK_MY_SHOW", JOptionPane.INFORMATION_MESSAGE, icon);
        f1.add(l1);
        f1.add(l2);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(l3);
        f1.add(l4);
        //f1.add(l5);
        f1.setSize(600, 400);
        f1.setVisible(true);
        //f1.setLayout(new GridLayout());
        f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f1.getContentPane().setBackground(Color.pink);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==b1)
        {
            login page = new login();
            page.setVisible(true);
        }
        else if(ae.getSource()==b2)
        {
            newuser p=new newuser();
            p.setVisible(true);
        }
    }
    public static void main(String aa[])
    {
        try
        {
            booking form = new booking();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}


