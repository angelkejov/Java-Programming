import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login implements ActionListener {
    JFrame f1 = new JFrame("Log In");
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1;
    JButton info_button;
    JLabel label = new JLabel("<html>Hello I'm Angel and this is my<br> " +
            "first own project. Like first game i" +
            "choose to make something easy<br> and simple" +
            " like Quiz game! HAVE FUN!</html>", SwingConstants.CENTER);

    Login() {
        l1 = new JLabel("User Name");
        l2 = new JLabel("Password");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        l1.setOpaque(true);
        l1.setBackground(Color.green);
        l2.setOpaque(true);
        l2.setBackground(Color.green);
        b1 = new JButton("Start Game");


        f1.getContentPane().setBackground(Color.DARK_GRAY);
        f1.setSize(400, 400);
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setLayout(null);

        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");
        f1.setIconImage(icon);

        f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f1.add(label);
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.getContentPane().add(b1);

        l1.setBounds(0, 30, 100, 30);
        t1.setBounds(110, 30, 100, 30);
        l2.setBounds(0, 70, 100, 30);
        t2.setBounds(110, 70, 100, 30);
        b1.setBounds(0, 120, 100, 30);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        f1.dispose();

        new Quiz();
    }
}

