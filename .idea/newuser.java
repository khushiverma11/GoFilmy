import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newuser extends JFrame implements ActionListener
{
    JFrame f1;
    JLabel l1,l2,l3,l4;
    JButton b1;
    JTextField t1;
    JPasswordField p;
    newuser()
    {
                f1 = new JFrame("SIGN UP");
                l1 = new JLabel("Username");
                l1.setBounds(40,50,100,20);
                t1= new JTextField(20);
                t1.setBounds(200,50,100,20);
                l2=new JLabel("Create Password");
                l2.setBounds(40,100,100,20);
                p=new JPasswordField(7);
                p.setBounds(200,100,100,20);
                b1 = new JButton("Sign in");
                b1.setBounds(150, 290, 100, 40);
                l3 = new JLabel("Gender");
                l3.setBounds(40, 150, 100, 20);
                JRadioButton r1 = new JRadioButton("Male");
                r1.setBounds(100, 150, 100, 20);

                JRadioButton r2 = new JRadioButton("Female");
                r2.setBounds(200, 150, 100, 20);
                JRadioButton r3 = new JRadioButton("  ");
                r3.setBounds(200, 150, 100, 20);
                r3.setEnabled(false);
                ButtonGroup bg = new ButtonGroup();
                bg.add(r1);
                bg.add(r2);
                bg.add(r3);

               l4 = new JLabel("");
               l4.setBounds(40, 200, 100, 20);
        //t3= new JTextField(20);
        //t3.setBounds(80,200,100,20);
                //SpinnerModel s1 = new SpinnerNumberModel(18, 1, 60, 1);

                //JSpinner sp1 = new JSpinner(s1);
                //sp1.setBounds(60, 200, 100, 30);
               //JSpinner sp = new JSpinner(s1);
                //sp.setBounds(60, 200, 100, 30);
                f1.add(l1);
                f1.add(l2);
                f1.add(t1);
                f1.add(p);
                f1.add(b1);
                f1.add(l3);
                f1.add(l4);
                f1.add(r1);
                f1.add(r2);
                f1.add(r3);
                //f1.add(sp1);
                f1.setSize(700, 700);
                f1.setVisible(true);
                f1.setLayout(null);
                b1.addActionListener(this);
                //r.addActionListener(this);
                f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                f1.setTitle("welcome");
                //1.setSize(400,200);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == b1)
        {
            hello page = new hello();
            page.setVisible(true);
        }
    }
    public static void main(String aa[])
    {
        try
        {
            newuser form = new newuser();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
