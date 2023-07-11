import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NewPage extends JFrame implements ActionListener
{
    NewPage()
    {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ABOUT THE MOVIE");
        setSize(600,600);
        setVisible(true);
        JLabel l1=new JLabel("About the Movie");
        l1.setFont(new Font("Serif", Font.BOLD, 16));
        l1.setBounds(200,100,150,50);
        JTextArea textArea = new JTextArea("Bholaa, a prisoner, is finally going home after 10 years of imprisonment to meet his young daughter. " +
                "His journey gets difficult when he is arrested mid-way. At first, " +
                "he is not aware of the grave situation he has got himself into but after a crazy incident takes place," +
                " he must travel a pathway full of crazy obstacles with death lurking around every corner. " +
                "Will he get to meet his daughter?");
        //textArea.setSize(400,400);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBounds(100,100,400,50);
        //JScrollPane scroll = new JScrollPane (textArea);

        JLabel l2=new JLabel("CAST");
        l2.setBounds(100,150,150,50);
        JTextField t1=new JTextField("Ajay Devgan as BHOLAA  + and Tabu as DIANA JOSEPH  ");
        setBackground(Color.CYAN);
        t1.setBounds(100,180,400,50);
        t1.setEditable(false);
        JLabel l3=new JLabel("Language");
        l3.setBounds(100,240,150,50);
        JTextField t2=new JTextField("Hindi, Urdu, Tamil");
        t2.setBounds(100,270,150,50);
        t2.setEditable(false);
        JLabel l4=new JLabel("Ratings: 7.5/10");
        l4.setBounds(100,320,150,50);
        JLabel l5=new JLabel("");
        l5.setBounds(100,240,150,50);
        JButton b1=new JButton("BOOK TICKETS");
        b1.setBounds(200,370,150,50);
        b1.addActionListener(this);
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(l4);
        add(l5);
        add(b1);
        add(textArea);
    }
    public void actionPerformed(ActionEvent w)
    {
        int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to Book Tickets", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION)
        {
            Nextpage p2 = new Nextpage();
            p2.setVisible(true);
        }
    }
    public static void main(String aa[]) {
        try {
            NewPage form = new NewPage();
            //form.setSize(300, 100);
            //form.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

